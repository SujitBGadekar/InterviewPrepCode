package General;

public class LargestElementinArray {

	public static void main(String[] args) {

		int array[]=new int[] {1,2,3,4,4,4,5,5};
		int max=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
			
		}
		System.out.println(max);

	}

}
