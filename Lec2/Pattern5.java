package Lec2;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nsp1 = n - 1;
		int nst = 1;
		int nsp2 = n - 2;
		for (int row = 0; row < n; row++) {
//			System.out.println(row);
//	space;
			for (int csp = 0; csp < nsp1; csp++) {
				System.out.print(" ");
			}
//	star fr nsp2 space or fr stars;
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("*");
				for (int csp = 0; csp < nsp2; csp++) {
					
					System.out.print(" ");
				}
			}
			System.out.println();
			nst++;
			nsp1--;
		}

	}
}
}
