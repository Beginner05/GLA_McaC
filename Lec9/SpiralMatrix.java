package Lec9;

public class SpiralMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		sol(arr);
	}

	public static void sol(int arr[][]) {
		int cr = 0;
		int cc = 0;
		int er = arr.length - 1;
		int ec = arr[0].length - 1;
		int total = arr.length * arr[0].length;
		int cnt = 0;
		while (cnt < total) {
//		loop1
			for (int col = cc; col <= ec && cnt < total; col++) {
				System.out.print(arr[cr][col] + " ");
				cnt++;
			}
			cr += 1;
			for (int row = cr; row <= er && cnt < total; row++) {
				System.out.print(arr[row][ec] + " ");
				cnt++;
			}
			ec--;
			for (int col = ec; col >= cc && cnt < total; col--) {
				System.out.print(arr[er][col] + " ");
				cnt++;
			}
			er--;

			for (int row = er; row >= cr && cnt < total; row--) {
				System.out.print(arr[row][cc] + " ");
				cnt++;
			}
			cc++;
		}
	}
}
