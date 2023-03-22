package String;

public class RemoveNumbersFromString {

	public static void main(String[] args) {

		String str="Sujit123";
		String result="";
		char charArray[]=str.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(!Character.isDigit(charArray[i])) 
			{
				result = result + charArray[i];
			}
			
		}
		System.out.println(result);
		
		
	}

	}


