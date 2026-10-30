package InstagramAccount;

public class HashtagTrend {
    private final String trendCode;
    private String hashtag;
    private int useCount;

    public HashtagTrend(String code, String hashtag, int count) {
        trendCode = code;
        this.hashtag = hashtag;
        useCount = Math.max(0, count);
    }

    public void recordUse() {
        useCount++;
    }

    public void displayTrend() {
        System.out.println(trendCode + " | " + hashtag + " | Uses: " + useCount);
    }
}