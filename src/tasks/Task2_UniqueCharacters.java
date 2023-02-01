package tasks;

public class Task2_UniqueCharacters {
    /*
    Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

     */
    public static void main(String[] args) {

        String str = "aabccdeef";
        String result = ""; //"b"

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }

        }
        System.out.println(result);

        System.out.println("----------------------------------------------------");


        String str1 = "aabccdeef";
        String result1 = "";

        for (int i = 0; i < str1.length(); i++) {
            int frequency = 0;
            char ch = str1.charAt(i);
            for (int j = 0; j < str1.length(); j++) {
                char ch2 = str1.charAt(j);
                if (ch == ch2) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                result1 += ch;

            }
        }
        System.out.println(result1);
        System.out.println("----------------------------------------------------");

        String str2 = "AABBCCBC";

        String result2 = "";

        // i <= 7 ===>  i < 8
        for (int i = 0; i < str2.length(); i++) {

            String ch = "" + str2.charAt(i);

            if (!result2.contains(ch)) { // if the character is not contained in the result
                result2 += ch; // the character will be added to the result
            }

        }

        System.out.println(result2);

        System.out.println("---------------------------------------------------------------------");

        String word = "Civic";

        String reversed = "";

        for (int i = word.length()-1;  i >=0 ; i--) {
            reversed += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);


    }

}