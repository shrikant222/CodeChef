/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int a=(x%y+x/y);
            System.out.println(a);

// 			if(y==0){
// 				System.out.println("0");}
// 			else{
// 			if (y == 1) {
// 				System.out.println(x);
// 			} else {
// 				if (x > y) {
// 					int s = x % y;
// 					if (s == 0) {
// 						int R = x / y;

// 						System.out.println(R);
// 					} else {
// 						int R = x / y;
// 						System.out.println(R + s);
// 					}
// 				} else {
// 					System.out.println(x % y);

// 				}
// 			}
// 			}
        }
    }
}
