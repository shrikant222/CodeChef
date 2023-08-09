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
        int T= sc.nextInt();
        while(T-->0){
            int N = sc.nextInt(); //total num of qutions
            int X = sc.nextInt(); // num of corrct qutions
            int P = sc.nextInt(); // passing marks
            int s= (X*3-(N-X));
            
            if(s>=P){
                System.out.println("PASS");
            }
            else{
                System.out.println("FAIL");
            }
        }
        
     
        }
    }

