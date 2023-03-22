package General;

public class PrintElementInOddPosition {

	public static void main(String[] args) {

		int count=0;	
		int array[]=new int[] {1,2,3,4,4,4,5,5};
		
		for(int i=0;i<array.length;i=i+2) {
			System.out.println(array[i]);
		}

	}

}
