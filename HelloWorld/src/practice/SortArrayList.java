package practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		
		Integer[] numbers = {2,3,600,3,10,45,3,50};
		List<Integer> alist = new ArrayList<>(Arrays.asList(numbers));
		alist.add(1);
		alist.add(7);
		
		System.out.println("Before Sorting ------"+alist);
		
		Collections.sort(alist);
		
		System.out.println("After sorting-------"+alist);
		
		List<String> blist = new ArrayList<>(Arrays.asList("Physics", "Python", "Mathematics"));
		blist.add("Java");
		
		System.out.println("Before Sorting ------"+blist);
		
		Collections.sort(blist);
		
		System.out.println("After sorting-------"+blist);
		
		List<Integer> clist = new ArrayList<>(List.of(2,300,4,105,6,10,98));
		clist.add(1);
		clist.add(10);
		
		System.out.println("Before Sorting ------"+clist);
		
		Collections.sort(clist);
		
		System.out.println("After sorting-------"+clist);
		
		List<Integer> dlist = new ArrayList<>(Arrays.asList(3,6,55,25,5));
		dlist.add(110);
		System.out.println("Before Sorting ------"+dlist);
		
		Collections.sort(dlist);
		
		System.out.println("After sorting-------"+dlist);

	}

}
