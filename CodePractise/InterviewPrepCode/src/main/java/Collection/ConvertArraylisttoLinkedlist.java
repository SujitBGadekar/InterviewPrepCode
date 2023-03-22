package Collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ConvertArraylisttoLinkedlist {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Sujit");
		al.add("Bhagwat");
		al.add("Gadekar");
		
		LinkedList<String> LL = new LinkedList<String>(al);
		System.out.println("Array List"+al);
		System.out.println("Linked List"+LL);

	}

}
