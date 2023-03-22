package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddElementinHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set=new HashSet<String>();
		set.add("ABC");
		set.add("DEF");
		set.add("EFG");
		
		
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


	}

}
