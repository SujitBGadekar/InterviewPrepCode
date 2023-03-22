package Collection;

import java.util.Arrays;
import java.util.List;

public class AddArrayintoArrayList {

	public static void main(String[] args) {
		String[] words = { "ace", "boom", "crew", "dog", "eon" };

		String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };

// Conversion of array to ArrayList
// using Arrays.asList
		List al = Arrays.asList(geeks);

		System.out.println(al);

	}

}
