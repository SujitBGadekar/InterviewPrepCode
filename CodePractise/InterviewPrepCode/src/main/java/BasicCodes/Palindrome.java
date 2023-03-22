package BasicCodes;

public class Palindrome {

	public static void main(String[] args) {

		String str="AKA",rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev = rev + str.charAt(i);
		}
		
		if(str.equals(rev))
			System.out.println("String is Palindrome");
		else
			System.out.println("String Not Plindrome");

	}

}
