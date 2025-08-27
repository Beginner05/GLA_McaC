package Lec3;

public class Pattern11 {

	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int nst = 1;
	for (int row = 0; row < 2 * n - 1; row++) {
		for (int cst = 0; cst < nst; cst++) {
			System.out.print("* ");
		}
		if (row < n - 1) {
			nst++;
		} else {
			nst--;
		}
		System.out.println();
	}
}

}
