/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code
{
    public static void main (String[] args) throws java.lang.Exception
    {Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z=  sc.nextInt();
            if(x/y==0&&x/y==1){
                System.out.println(z);
            }
            else{
                if(x%y==0){
                    System.out.println((x/y)*z);
                }
                else{
                    System.out.println(((x/y)+1)*z);
                }
            }
        }

    }

}
