package String;

public class ReplaceStringWithDash {

	public static void main(String[] args) {
		String str="Once in Blue moon";
		char ch='-';
		str=str.replace(' ', ch);
        System.out.println("After replacing spaces in given string ");
        System.out.println(str);

	}

}
