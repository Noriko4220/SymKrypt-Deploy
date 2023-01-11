package program;

import java.util.ArrayList;

public class circularRotation {
    private ArrayList<String> SK = new ArrayList<String>();
    private String[] stringArray;
    private String temp = "";


    public String rotateRight(String SK, int round) {
        stringArray = SK.split("");
        int rotatedTimeRight = 0;
        while(rotatedTimeRight < round) {
            int i = 0, j = stringArray.length - 1;
            while (i != j) {
                temp = stringArray[i];
                stringArray[i] = stringArray[j];
                stringArray[j] = temp;
                i++;
            }
            rotatedTimeRight++;
        }
        //System.out.println(String.join("",stringArray));
        return String.join("",stringArray);
    }

    public String rotateLeft(String SK, int round) {
        stringArray = SK.split("");
        int rotatedTimeLeft = 0;
        while(rotatedTimeLeft < round) {
            int i = 0, j = stringArray.length - 1;
            while (i != j) {
                temp = stringArray[j];
                stringArray[j] = stringArray[i];
                stringArray[i] = temp;
                j--;
            }
            rotatedTimeLeft++;
            //System.out.println(String.join("",stringArray));
        }

        return String.join("",stringArray);
    }
}
