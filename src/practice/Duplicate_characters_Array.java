package practice;

public class Duplicate_characters_Array 
{
	public static void main(String[] args)
	{
		char x[] = {'a','b','c','b','d','l','k','*','*','c','l','c'};
		int LI = x.length-1;
		int count;
		
		for(int i = 0; i<=LI; i++)
		{
			count = 0;
			for(int j= i+1; j<=LI; j++)
			{
				if(x[i]==x[j]&&x[i]!=' ')
				{
					count++;
					x[j]=' ';
				}
			}
			
			if(count>0 && x[i]!=' ')
			{
				System.out.println(x[i]+" "+(count+1)+" "+"Times");
				System.out.println();
			}
		}
	}
	

}
