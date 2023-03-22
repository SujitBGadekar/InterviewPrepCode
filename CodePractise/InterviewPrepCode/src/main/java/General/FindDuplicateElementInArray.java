package General;

public class FindDuplicateElementInArray {

	public static void main(String[] args) {

		int count=0;	
		int array[]=new int[] {1,2,3,4,4,4,5,5};
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]==array[j])
				{
					System.out.println(array[j]);
				}
			}
			
		}

	}

}
