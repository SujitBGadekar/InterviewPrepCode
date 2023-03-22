package String;

public class ReverseStringWithoutReverseFun {

	public static void main(String[] args) {
//		String s = "AGHFB"; // reading string from user
//		System.out.print("After reverse string is: ");
//		for (int i = s.length(); i > 0; --i) // i is the length of the string
//		{
//			System.out.print(s.charAt(i - 1)); // printing the character at index i-1
//		}
		
		String name="rishi thakur";
		char[] c=name.toCharArray();
		for(int i=c.length-1;i>=0;i--)
		{
		System.out.print(c[i]);
		}
		System.out.println();

		

	}
}
