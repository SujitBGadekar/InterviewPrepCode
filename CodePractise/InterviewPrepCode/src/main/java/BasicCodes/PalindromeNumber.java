package BasicCodes;

public class PalindromeNumber {

	public static void main(String[] args) {
		String rev="", str="454";
		int str1=str.length();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		System.out.println("Rev"+rev);
		if(str.equals(rev))
		{
			System.out.println("string is palindrome ");
		}
		else
		{
			System.out.println("String is Not Palindrome ");
		}

	}

}
