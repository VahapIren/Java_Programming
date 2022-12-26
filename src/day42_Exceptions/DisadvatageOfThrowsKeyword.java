package day42_Exceptions;

public class DisadvatageOfThrowsKeyword {

    public static void main(String[] args){

        System.out.println("Hello");
        //sleep(2.4);
        System.out.println("Hello World");
        System.out.println("-------------------------");

        System.out.println("Hello");
        MorningWorkOut.sleep(2.4);
        System.out.println("Cydeo");

    }
    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep((long)(seconds*1000));

    }
}
