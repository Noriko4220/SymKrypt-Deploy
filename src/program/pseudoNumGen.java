package program;

import java.util.ArrayList;

public class pseudoNumGen {
    private String SK;
    private String S;
    private int B;
    private int i;
    private int l;
    private long n2;
    private int d;
    private int e;
    private String s1;
    private ArrayList<String> a1 = new ArrayList();

    private long procedure(){
        i = 0;
        l = (SK.length() + 1);
        while (B >= 1) {
            d = S.hashCode();
            S = Integer.toString(d);
            e = S.hashCode();
            S = Integer.toString((d ^ e));
            a1.add(Integer.toString(d & 1));
            B = B - 1;
        }

        for(int i = 0; i < a1.size(); i++) {
            n2 = n2 + Long.parseLong(a1.get(i));
        }
        return n2;
    }

    private void getParams(String SK, String S, int B){
        this.SK = SK;
        this.S = S;
        this.B = B;
    }

    public long pNumGen(String SK, String S, int B) {
        getParams(SK,S,B);
        return procedure();
    }
}
