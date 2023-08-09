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
       while(N-->0)
       {
           	int x = sc.nextInt();
				int y = sc.nextInt();
				int a = sc.nextInt();
				int b = sc.nextInt();
           int count=2;
           if((x==a)||(x==b)){
              count--;
           }
           if((y==a)||(y==b)){
              count--;
           }
           System.out.println(count);
       }
    }
}