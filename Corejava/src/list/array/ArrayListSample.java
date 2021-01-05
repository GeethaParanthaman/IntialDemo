package list.array;

import java.util.ArrayList;

public class ArrayListSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> aList = new ArrayList<String>();
		aList.add("Geetha");
		aList.add("Paranthaman");
		aList.add("Akshitha");
		System.out.println("initial List array" + aList);
		System.out.println(aList.indexOf("Paranthaman"));
		System.out.println(aList.indexOf("Geetha"));
		aList.add(0, "Akshara");
		System.out.println("List after adding of akshara:" + aList);
		System.out.println(aList.get(0));
		aList.remove("Geetha");
		System.out.println("list after removal of Geetha:" + aList);
		aList.remove(0);
		System.out.println("list after removal of Akshara:" + aList);
		System.out.print("is List contains Akshitha:");
		System.out.println(aList.contains("Akshitha"));
		System.out.print("is List contains Geetha:");
		System.out.println(aList.contains("Geetha"));
		System.out.print("Is array is Empty:");
		System.out.println(aList.isEmpty());
		System.out.println("Size of the array"+aList.size());
		aList.add("Paranthaman");
		System.out.println("after adding duplictaion "+aList);
	}

}
