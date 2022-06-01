import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ball {
    public static void main(String[] args) {
        while (true) {
            Random z = new Random();
            int[] n = new int[6];
            int[] y = new int[6];
            int count = 0;
            int bluesystem;
            bluesystem = z.nextInt(1, 17);
            int bluecustomer;
            for (int i = 0; i < 6; i++) {
                Scanner s = new Scanner(System.in);
                System.out.println("please input the num " + (i + 1) + " red ball");
                n[i] = s.nextInt();
                if (n[i]<1 | n[i]>33){
                    System.out.println("your red ball is err,please Reenter");
                    i--;
                }
                else if (i >= 1){
                    for (int k = 0; k < i; k++) {
                        if (n[i] == n[k]) {
                            System.out.println("the num is repeat,please Reenter");
                            i -= 1;
                        }
                    }
                }
            }
            Scanner s = new Scanner(System.in);
            System.out.println("please input the blue ball");
            while (true) {
                int t = s.nextInt();
                if (t < 0 | t > 17) {
                    System.out.println("your blue ball is err,please Reenter ");
                }
                else{
                    bluecustomer = t;
                    break;
                }
            }
            for (int i = 0; i < 6; i++) {
                y[i] = z.nextInt(1, 34);
                if (i >= 1) {
                    for (int k = 0; k < i; k++) {
                        if (y[i] == y[k]) {
                            i = 0;
                            break;
                        }
                    }
                }
            }
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (n[i] == y[j]) {
                        count++;
                        break;
                    }
                }
            }
            System.out.println("the red ball that you choose is:" + Arrays.toString(n));
            System.out.println("the price red ball is:" + Arrays.toString(y));
            System.out.println("the red ball that you bingo is:" + count);
            System.out.println("the blue ball that you choose is:" + bluecustomer);
            System.out.println("the price blue ball is:" + bluesystem);
            if ((count == 0 | count == 1 | count == 2) && bluecustomer == bluesystem) {
                System.out.println("you get the no.6 prize 5 dollars");
            }
            else if(count==3&bluecustomer==bluesystem){
                System.out.println("you get the no.5 prize 10 dollars");
            }
            else if(count==4){
                if (bluecustomer==bluesystem){
                    System.out.println("you get the the no.4 prize 200dollars");
                }
                else {
                    System.out.println("you get the no.5 prize 10 dollars");
                }
            }
            else if (count == 5 ) {
                if(bluecustomer == bluesystem){
                    System.out.println("you get the no.3 prize 3000 dollars");
                }
                else {
                    System.out.println("you get the no.4 prize 200 dollars");
                }
            }
            else if (count == 6) {
                if (bluecustomer==bluesystem){
                    System.out.println("you get the the no.1 prize 10000000000dollars");
                }
                else {
                    System.out.println("you get the no.2 prize 5000000 dollars");
                }
            }
            else {
                System.out.println("Thank you for your contribution to welfare");
            }
        }
    }
}