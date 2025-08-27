package Lec9;

public class Diagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		sol(arr);
	}
	public static void sol(int arr[][])
	{
		int nod=arr.length+arr[0].length-1;
		int cnt=0;

		int cc=0;
		int cr=0;
		while(cnt<nod)
		{
			int row=cr;
			int col=cc;
			while(row<arr.length&&col>=0)
			{
				System.out.print(arr[row][col]+" ");
				row++;
				col--;
			}
			if(cc!=arr[0].length-1)
			cc++;
			else cr++;
			
			cnt++;
		}
	}

}
