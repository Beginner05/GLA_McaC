package Lec2;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();
		int nsp = n - 1;
		int nst = 1;

		for (int row = 0; row < n; row++) {
//	space
			for (int csp = 0; csp < nsp; csp++) {
				System.out.print("  ");
			}
//	stars
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("* ");
			}
//	nsp+=2;
			nst = nst + 2;
			nsp--;
			System.out.println();
		}

	}

}