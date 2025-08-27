package Lec9;

public class Leetcode17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sol("aaaaaaa");
		
    }
	public static void sol(String str)
	{
		String ans="";
		for(int i=0;i<str.length();)
		{
			int cnt=1;
			while(i+cnt<str.length()&&str.charAt(i)==str.charAt(i+cnt))
			{
				cnt++;
			}
			if(cnt!=1)
			ans+=str.charAt(i)+""+cnt;
			else ans+=str.charAt(i);
			i=i+cnt;
		}
		System.out.println(ans);
	}

}
