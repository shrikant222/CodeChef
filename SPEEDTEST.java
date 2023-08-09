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
           int A = sc.nextInt();//Alice distance
           int X = sc.nextInt();//time
           int B = sc.nextInt();//bob distance
           int y = sc.nextInt();//time
           float speed1=(float)A/X;
           float speed2=(float)B/y;
           if(speed2>speed1){
               System.out.println("Bob");
           }
           else if(speed1==speed2){
                System.out.println("Equal");
           }
           else{
               System.out.println("Alice");
           }
            }


    }
}

