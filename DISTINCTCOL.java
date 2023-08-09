/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Code {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N =sc.nextInt();//colors

            int[] arr = new int[N];
            for(int i=0; i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            
            System.out.println(arr[N-1]);
        }


    }
}

