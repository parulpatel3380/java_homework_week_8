package homework_week_8;
/*
14. Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
 */

import java.util.Scanner;

public class Programme14_DiamondPattern {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter number : ");
    int n = scan.nextInt();
    diamond(n);

}

    public static void diamond(int n) {
        int i = 1;
        int k, j;
        while (i <= n) {
            k = 1;
            while (k <= n - i) {
                System.out.print(" ");
                k++;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        i = n - 1;
        while (i > 0) {
            k = n;
            while (k > i) {
                System.out.print(" ");
                k--;
            }
            j = 1;
            while (j <= 2 * i - 1) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;


        }
     }

   }
