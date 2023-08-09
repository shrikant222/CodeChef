/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int X = sc.nextInt(); // chef1
            int Y = sc.nextInt(); // chef2
            int A = sc.nextInt(); // arch rival1
            int B = sc.nextInt(); // arch rival2
            if ((X == A && Y == B) || X == B && Y == A) {
                System.out.println("0");
            } else if (X == A || X == B) {
                System.out.println("1");

            } else if (Y == A || Y == B) {
                System.out.println("1");
            }
            else {
                System.out.println("2");
            }


        }


    }
}

