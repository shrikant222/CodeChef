

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
            int a=sc.nextInt();
            
            if(x<=a && y>a){
             System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            
            
        }
    }
}
