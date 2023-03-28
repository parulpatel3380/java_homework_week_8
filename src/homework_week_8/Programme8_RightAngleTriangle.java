package homework_week_8;
/*
8. Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

import java.util.Scanner;

public class Programme8_RightAngleTriangle {
    public static void main(String[] args) // declared main method
    {
      Scanner scan = new Scanner(System.in); // declared and created object to read the input from console
        System.out.println("Enter The number of rows : ");
        int n=scan.nextInt(); // take the input
        Programme8_RightAngleTriangle obj = new Programme8_RightAngleTriangle(); // object creation to call instance method
        obj.rightAngleTriangle(n); // instance method calling
        scan.close(); // scanner closing
    }
    public void rightAngleTriangle(int n) // declaring instance method
    {
        // logic to print the triangle with@
        for(int i = 0;i<n;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("@"); // output
            }
            System.out.println(" ");

         }
      }
    }
