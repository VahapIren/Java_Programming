package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class testt {
    public static void main(String[] args) {
            //DO NOT TOUCH THE FOLLOWING LINES
            Scanner input = new Scanner(System.in);
            float[] scores = new float[7];
            //WRITE YOUR CODE HERE
            for (int i = 0; i < scores.length; i++) {
                System.out.println("Enter score for judge "+(i+1)+":");
                scores[i]=input.nextInt();
            }
            Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
            //scores[0]=0;
            //scores[scores.length-1]=0;
            int sum=0;
            for (int i=1;i<scores.length-1;i++){
                sum+=scores[i];
            }
            System.out.println("Enter the difficulty rating:");
            double rate=input.nextDouble();
            double finalScore=sum*rate*0.6;
            System.out.println("Final Score: "+finalScore);

        }
}
