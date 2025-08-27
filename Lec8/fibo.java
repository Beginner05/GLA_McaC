package Lec8;

public class fibo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int val=5;
	int ans=sol(50);
	System.out.println(ans);
	}
	public static int sol(int n)
	{
		if(n==0||n==1)return n;
	int fh= sol(n-1);
	int sh=sol(n-2);
	return fh+sh;
	}
}