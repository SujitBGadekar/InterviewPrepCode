package General;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraytoArrayList {

	public static void main(String[] args) {
		
		
		String array[]= {"a","b","c"};
		System.out.println(array[0]);
		
		List<String> list=Arrays.asList(array);
		System.out.println(list);
		
		//Method 2
		List<String> list1=new ArrayList();
		Collections.addAll(list1, array);
		System.out.println(list1);
		
		//Method 3
		List<String> list2=new ArrayList();
		for(String text:array)
		{
			list2.add(text);
		}
		System.out.println(list2);


	}

}
