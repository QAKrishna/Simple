package practice;

public class Reverse_Number
{
	public static void main(String[] args) 
	{
		int GN = 965791754;
		int reverse = 0;
		
		while(GN!=0)
		{
			int reminder = GN%10;
			reverse = reverse*10+reminder;
			GN = GN/10;
		}
		System.out.println(reverse);
	}

}
