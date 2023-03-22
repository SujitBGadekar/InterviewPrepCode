package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertLinkedlisttoArrayList {

	public static void main(String[] args) {
		LinkedList<String> linkedlist= new LinkedList<String>();
		linkedlist.add("Tom");
		linkedlist.add("BOM");
		linkedlist.add("DOM");
		System.out.println(linkedlist);
		ArrayList<String> Al=new ArrayList<String>(linkedlist);
		
			System.out.println(""+Al);

	}

}
