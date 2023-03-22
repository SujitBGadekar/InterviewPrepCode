package String;

public class SwappingString {

	public static void main(String[] args) {
		String str1="Good",str2="Morning";
		System.out.println("String Before Swaping "+str1+""+str2);
		
		str1=str1+str2;
		System.out.println("str1"+str1);
		str2=str1.substring(0,(str1.length()-str2.length()));
		System.out.println("str2"+str2);
		str1=str1.substring(str2.length());
		
		System.out.println("String after swapping "+str1+""+str2);

	}

}
