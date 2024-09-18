package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToHashSet {

	public static void main(String[] args) {
		
		String[] fruits = {"Oranges", "Apples", "Bananas",
				"Mangoes","Oranges","Mangoes","Apples"};
		List<String> slist = new ArrayList<>(Arrays.asList(fruits));
		
		System.out.println("Printing List--------"+slist);
		
		Set<String> fset = new HashSet<>(slist);//Converting ArrayList to Set
		
		System.out.println("Printing Set--------"+fset);
		
		List<String> ulist = new ArrayList<>(fset);//Converting back to ArrayList
		
		System.out.println("Printing uList--------"+ulist);
	}

}
