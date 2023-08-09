/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Code
{
    public static void main (String[] args) throws java.lang.Exception
    {
        	// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int p,r,l;
		while(t-->0)
		{
		    p=sc.nextInt();
		    r=sc.nextInt();
		    l=sc.nextInt();
		    if(p+r+l==180)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
		    
		}
	}
}
