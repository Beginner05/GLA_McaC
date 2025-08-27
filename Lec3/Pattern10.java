package Lec3;

public class Pattern10 {

	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int nsp1 = n - 1;
	int nsp2 = n - 2;
//	nsp1:mtlb phele star se phele wala sapce;
//	nsp:mtlb phele star se baad wala space;
	int nst = 1;
	for (int row = 0; row < n; row++) {
//	space
		for (int csp = 0; csp < nsp1; csp++) {
			System.out.print("  ");
		}
//	star
		for (int cst = 0; cst < nst; cst++) {
			System.out.print("* ");
			for (int csp = 0; csp < nsp2; csp++) {
				if (csp == nsp2 / 2 && cst != nst - 1) {
					System.out.print("! ");
				} else {
					System.out.print("  ");
				}
			}
		}
		System.out.println();
		nsp1--;
		nst++;
	}
}

}
