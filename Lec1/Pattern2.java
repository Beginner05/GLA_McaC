package Lec1;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		int n = 5;
		int nst = 1;
		for (int row = 0; row < n; row++) {
			for (int cst = 0; cst < nst; cst++) {
				System.out.print("*");
			}
			nst++;
			System.out.println();
		}
	}

}
