package Lec2;

public class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int nst = n;
		int nsp = n - 2;
		for (int row = 1; row <= n; row++) {
			if (row == 1 || row == n) // yeh if tb chlega jb row first h or row last h
			{
				for (int cst = 0; cst < nst; cst++) {
					System.out.print("* ");
				}
			}
//	bhai, agr if me nhi gya mtlb h ki row na he
//	last h or naa he first h
			else {
				System.out.print("* ");
				for (int csp = 0; csp < nsp; csp++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}
