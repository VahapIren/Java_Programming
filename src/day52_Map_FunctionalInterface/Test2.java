package day52_Map_FunctionalInterface;

import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEach;
        printEach=(s)->{
            for (String each : s.split("")) {
                System.out.println(each);
            }
        };
        printEach.Test("Wooden Spoon");


        MySecondFunctionalInterface<Integer> cube=(n)->{
            System.out.println(n*n*n);
        };
        cube.Test(5);




    }

}
