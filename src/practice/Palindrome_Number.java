package practice;

public class Palindrome_Number 
{
	public static void main(String[] args) 
	{
		int GN = 121;
		int temp = GN;
		int reverse = 0;
		int reminder;
		while(temp!=0)
		{
			reminder = temp%10;
			reverse = reverse*10+reminder;
			temp = temp/10;
		}
		if(reverse == GN)
		{
			System.out.println("The Given Number is Palindrome");
		}
		else
		{
			System.out.println("The given number is not Palindrome");
		}
		
		
	}

}
