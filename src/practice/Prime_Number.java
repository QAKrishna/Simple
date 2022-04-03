package practice;

public class Prime_Number
{
	public static void main(String[] args)
	{
		int GN = 11;
		int temp = 0;
		
		for(int i = 2; i<=GN-1; i++)
		{
			if(GN%i==0)
			{
				temp = temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("The given number is not Prime");
		}
		else
		{
			System.out.println("The Given Number is Prime");
		}
	}
}
