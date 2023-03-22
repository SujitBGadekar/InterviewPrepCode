package String;

public class CountStringOccurances {

	public static void main(String[] args) {

		String str="Sujitttt";
		char search='t';
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == search)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
