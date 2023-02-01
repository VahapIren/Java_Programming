package tasks;

public class Task1_ReverseString {
   /* 1. Write a program that can reverse any given string

    Ex:
    input:
    Wooden Spoon

    output:
    noopS nedooW

    */
   public static void main(String[] args) {
       String str="Wooden Spoon";
       String result="";
       for (int i = str.length()-1; i >= 0; i--) {
        result+=str.charAt(i);
       }
       System.out.println("result = " + result);

   }
}
