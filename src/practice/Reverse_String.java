package practice;

public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String name = "Krishna Londe";
		int LI = name.length()-1;
		
		String s = "";
		for(int i = LI; i>=0; i--)
		{
			char c = name.charAt(i);
			s = s +c;
		}
		
		name = s;
		System.out.println(name);
	}

}
