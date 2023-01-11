package program;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap noi dung ma hoa");
        String inputString = scanner.nextLine();
        String c = new symKEnc().symKEncrypt(inputString,"12345","5121141",128);
        String d = new symKDec().symKDecrypt(c, "12345", "5121141",128);
        System.out.println("Ma hoa duoi dang nhi phan theo khoa : " + c);
        System.out.println("Giai ma : " + d);
    }
}
