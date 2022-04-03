package practice;

public class Replace_SpecialChar_String 
{
	public static void main(String[] args) 
	{
		String str = "%*&J@#A&*!V**A%^*";
		String plainstr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainstr);
		
	}

}
