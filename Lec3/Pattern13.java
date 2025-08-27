package Lec3;
import java.util.Scanner;
public class Pattern13 {
public static void main(String args[])
{
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int nst=n/2;
	int nsp=1;
	for(int row=0;row<n;row++)
	{
		if(row==0||row==n-1)
		{
//			sirf stars he print krne h
			for(int cst=0;cst<n;cst++)
			{
				System.out.print("* ");
			}
		}
		else {
//			iske mtlb aap 1 se n-2 row k liye kaam kr rhe ho
			for(int cst=0;cst<nst;cst++)
			{
				System.out.print("* ");
			}
			
			for(int csp=0;csp<nsp;csp++)
			{
				System.out.print("  ");
			}
			for(int cst=0;cst<nst;cst++)
			{
				System.out.print("* ");
			}
			if(row<n/2)
			{
				nsp+=2;
				nst--;
			}
			else {
				nsp-=2;
				nst++;
			}
			
		}
		System.out.println();
	}

		}

	}
