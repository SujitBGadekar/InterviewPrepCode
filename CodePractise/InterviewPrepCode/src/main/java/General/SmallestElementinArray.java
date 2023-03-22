package General;

public class SmallestElementinArray {

	public static void main(String[] args) {

		int array[]=new int[] {1,2,3,4,4,4,5,5};
		int min=array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<min)
			{
				min=array[i];
			}
		}
		System.out.println(min);

		
	}

}
