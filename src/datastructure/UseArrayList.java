package datastructure;

import java.util.ArrayList;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> arrayList=new ArrayList<String>();

		arrayList.add("Moe");
		arrayList.add("Zack");
		arrayList.add("Nacer");
		arrayList.add("David");
		arrayList.add("Maz");
		arrayList.add("Yousuf");

		arrayList.add(2,"hemal");
		arrayList.remove(1);
		System.out.println(arrayList);
	

	}

}
