package Lec3;

public class Pattern12 {

	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int nsp = n - 1;
	int nst = 1;
	for (int row = 0; row < 2 * n - 1; row++) {
//space
		for (int csp = 0; csp < nsp; csp++) {
			System.out.print("  ");
		}
//stars;
		for (int cst = 0; cst < nst; cst++) {
			System.out.print("* ");
		}
		if (row < n - 1) {
			nst++;
			nsp--;

		} else {
			nst--;
			nsp++;
		}
		System.out.println();
	}

}

}
