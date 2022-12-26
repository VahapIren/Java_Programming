package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvategeOfThrowsKeyword2 {

    public static void method() throws FileNotFoundException, InterruptedException {
        try {
            method1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        method2();
        method3();

        String str=null;
        try {
            System.out.println(str.charAt(0));
        } catch (NullPointerException e) {
            e.printStackTrace();
        }


    }
    public static void method1() throws InterruptedException {

        //new FileInputStream("");
        Thread.sleep(2000);

    }
    public static void method2() throws InterruptedException {

        method1();

    }
    public static void method3() throws InterruptedException {

        method2();
        Thread.sleep(1000);

    }
    public static void metho4() throws InterruptedException {
        method3();
    }
}
