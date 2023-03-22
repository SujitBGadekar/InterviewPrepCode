package BasicCodes;

public class RemoveDuplicateElementfromArray {

	public static void main(String[] args) {
		int myarray[]= {1,5,6,10,5,6};
		for(int i=0;i<myarray.length;i++)
		{
			for(int j=i+1;j<myarray.length;j++)
			{
				if(myarray[i]==myarray[j] && i!=j)
				{
					System.out.println(myarray[j]);
				}
			}
		}

	}

}
