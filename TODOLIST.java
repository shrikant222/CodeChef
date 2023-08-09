/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int T= sc.nextInt();
        while (T-- > 0) {
            int count=0;
            int N=sc.nextInt();
            int[] arr = new int[N];
            for(int i =0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            for(int a: arr){
                if (a>=1000){
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}

