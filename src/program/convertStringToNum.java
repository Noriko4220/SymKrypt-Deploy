package program;

public class convertStringToNum {
    private int m = 0;
    private int SK;
    private int S;

    public long convertMessage(String m) {
        int i = 0;
        while (i < m.length()) {
            this.m = this.m + m.charAt(i);
            i++;
        }
        return this.m;
    }

    public int convertSharedKey(String SK) {
        int i = 0;
        while (i < SK.length()) {
            this.SK = this.SK + SK.charAt(i);
            i++;
        }
        return this.SK;
    }

    public long convertSeed(String S) {
        int i = 0;
        while (i < S.length()) {
            this.S = this.S + S.charAt(i);
            i++;
        }
        return this.S;
    }
}
