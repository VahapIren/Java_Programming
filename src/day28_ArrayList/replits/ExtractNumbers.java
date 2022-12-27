package day28_ArrayList.replits;

import java.util.Scanner;

public class ExtractNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    }
    public static String extractNum(String s) {

        char[] chars=s.toCharArray();
        String result="";

        for (char ch : chars) {
            if (ch>=48&&ch<=57)
                result+=ch+"";
        }
        return result;

    }
}
