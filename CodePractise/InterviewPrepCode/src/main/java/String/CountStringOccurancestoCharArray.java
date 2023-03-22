package String;

public class CountStringOccurancestoCharArray {

	public static void main(String[] args) {
		String string1="Greate Responsibility";
		int count=0;
		char[] string2=string1.toCharArray();
		for(int i=0;i<string2.length;i++)
		{
			count=1;
			for(int j =i+1;j<string2.length;j++)
			{
				if(string2[i]==string2[j])
				{
					count++;
					
					string2[j]=0;
				}
			}
			if(count>1 && string2[i]!=0)
				System.out.println("Repeted String is-->"+string2[i]);
		}
 
	}

}
