package General;

public class PrintElementinDescendingOrder {

	public static void main(String[] args) {

		int array[]=new int[] {1,2,3,8,4,4,4,5,5};

		int temp=0;
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}
