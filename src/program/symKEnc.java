package program;

public class symKEnc {
    private long m;
    private int SK;
    private long S;
    private int rotateTime;
    private final int minRound = 5;
    private int C;
    private long P;
    private int i;
    private long r;
    private int odd;

    public String symKEncrypt(String m, String SK, String S, int B) {
        String message = m;
        this.m = new convertStringToNum().convertMessage(m);
        this.SK = new convertStringToNum().convertSharedKey(SK);
        this.S = new convertStringToNum().convertSeed(S);
        rotateTime = (this.SK % B) + minRound;
        i = 1;
        r = this.S % B;
        odd = this.SK & 1;
        while (i <= minRound) {
            P = new pseudoNumGen().pNumGen(SK, S, B);
            this.S = P;
            r = P % B;
            this.m = this.m ^ P;
            if ((P & 1) == 1) {
                message = new circularRotation().rotateLeft(message, (int) r);
                this.m = new convertStringToNum().convertMessage(message);

            } else {
                message = new circularRotation().rotateRight(message, (int) r);
                this.m = new convertStringToNum().convertMessage(message);
                //System.out.println(message);
            }
            i++;
        }
        message = new intToNumEnCDeC().convertStringToBinary(message);
        return message;
    }
}
