package Lec9;

public class Removehash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="#a#b##c";
	sol(str);
	}
	public static void sol(String str)
	{
		String hash="";
		String con="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='#')
			{
				hash+="#";
			}
			else {
				con+=str.charAt(i);
			}
		}
		System.out.print(hash+con);
	}

}
