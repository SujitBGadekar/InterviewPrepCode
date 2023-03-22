package String;

public class ReverseStringWithReverseFun {

	public static void main(String[] args) {

		String string = "Test123";
	      StringBuffer SB = new StringBuffer(string);
	      String reverse= SB.reverse().toString();
	      System.out.println("\nString before reverse: "+string);
	      System.out.println("String after reverse: "+reverse);

	}
}

