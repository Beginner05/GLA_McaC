package Lec9;

public class HashFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="aaabbbcaa";
				sol(str);
		
	}
	public static void sol(String str)
	{
		String ans="";
		for(int i=0;i<str.length();)
		{
			int cnt=1;
			while((cnt+i)<str.length()&&str.charAt(i)==str.charAt(cnt+i))
			{
				cnt++;
			}
			if(cnt!=1)
			ans+=str.charAt(i)+""+cnt;
			else ans+=str.charAt(i);
			i=cnt+i;
//			ans+=str.charAt(i)+" "+cnt;
		}
		System.out.println(ans);
	}
}