package Lec5;

public class TrappingRainWater {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,2,43,5,6};
		int res=sol(arr);
	System.out.println(res);
	}
	public static int sol(int arr[])
    {
        int ans=0;
        int left[]=new int[arr.length];
        int right[]=new int[arr.length];
       left[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
left[i]=Math.max(left[i-1],arr[i]);
        }
        right[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            ans+=Math.min(left[i],right[i])-arr[i];
        }
        return ans;
    }
}
