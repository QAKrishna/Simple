package practice;

public class duplicate_characters_String 
{
	public static void main(String[] args) 
	{
		String original = "Krishna Rajaram Londe";
		int LI = original.length()-1;
		int count;
		
		char alphabet[] = original.toCharArray();
		
		for(int i = 0; i<=LI; i++)
		{
			count = 0;
			
			for(int j = i + 1; j<=LI; j++)
			{
				if(alphabet[i]==alphabet[j] && alphabet[i]!=' ')
				{
					count++;
					alphabet[j] = ' ';
				}
			}
			
			if(count>0 && alphabet[i]!= ' ')
			{
				System.out.print(alphabet[i] + " " + (count+1) +" " + "Times");
				System.out.println();
			}
		}
	}

}
