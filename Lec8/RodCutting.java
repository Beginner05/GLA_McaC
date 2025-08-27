package Lec8;

public class RodCutting {

	public static void main(String[] args) {

		int n=5;
		int arr[]= {1, 5, 8, 9, 10, 17, 17, 20};
		int ans=sol(8,0,arr);
	System.out.println(ans);
	
	}
	public static int sol(int n,int profit,int price[])
	{
	if(n==0)return profit;
	int ans=0;
		for(int cut=1;cut<=n;cut++)
		{
			int res=sol(n-cut,profit+price[cut-1],price);
		ans=Math.max(ans, res);
		}
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
