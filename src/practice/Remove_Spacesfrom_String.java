package practice;

public class Remove_Spacesfrom_String
{
	public static void main(String[] args)
	{
		String str = "j  a v   a ";
		String plainstr = str.replaceAll(" ","");
		System.out.println(plainstr);
		
	}

}
