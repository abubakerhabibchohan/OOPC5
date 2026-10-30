package InstagramAccount;

public class InstagramAccount {
    private final String username;
    private String displayName;
    private String bio; private int[] recentPostLikes;
    private boolean isPrivate;
    private static int accountCount = 0;

    public InstagramAccount(String username, String displayName, String bio, int[] likes, boolean isPrivate) {

        this.username = username;
        this.bio = bio;
        this.displayName = displayName;
        this.isPrivate = isPrivate;

        recentPostLikes= new int[3];

        for (int i = 0; i < 3; i++) {
            recentPostLikes[i] = Math.max(0, likes[i]);
        }

        accountCount++;
    }

    public String getUsername() {
        return username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        if(bio != null && !bio.trim().isEmpty()) {
            this.bio = bio;
        } else {
            System.out.println("Invalid bio.");
        }
    }

    public void setPrivate(boolean value) {
        isPrivate = value;
    }

    public void updatePostLikes(int index, int likes) {
        if (index >= 0 && index < 3 && likes >= 0) {
            recentPostLikes[index] = likes;
        } else {
            System.out.println("Invalid likes or index.");
        }
    }

    public double calculateAverageLikes() {
        int sum = 0;

        for (int likes : recentPostLikes) {
            sum += likes;
        }
        return sum / 3.0;
    }

    public void displayProfile() {
        System.out.println(username + " | Bio: " + bio + " | Avg likes: " + calculateAverageLikes());
    }

    public static int getAccountCount() {
        return accountCount;
    }
}