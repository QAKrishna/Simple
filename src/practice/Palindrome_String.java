package practice;

public class Palindrome_String 
{
	
		public static void main(String[] args) 
		{
			String name = "madama";
			int LI = name.length()-1;
			
			String s = "";
			for(int i = LI; i>=0; i-- )
			{
				char c = name.charAt(i);
				s = s + c;
			}
			
			if(name.equals(s))
			{
				System.out.println("The String is Palindrome");
			}
			else
			{
				System.out.println("The String is not Palindrome");
			}
		
	}

}
