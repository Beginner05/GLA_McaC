package Lec7;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,1,1};
int res=sol(arr,0,0,1);
	System.out.println(res);
	}
	public static int sol(int arr[],int idx,int cnt,int trgt)
	{
		if(idx==arr.length)
		{
			return cnt;
		}
		if(arr[idx]==trgt)
		{
			int res=sol(arr,idx+1,cnt+1,trgt);
//	
		return res;
		}
		return sol(arr,idx+1,cnt,trgt);
	}

}
