package concepts;

import java.awt.List;
import java.util.ArrayList;

public class Duplicates {

	public static void main(String[] args) {
		// System.out.println("Hello World!");
		// tagname[starts-with(@id,'partial value')]
		// tagname[contains(@text(),'value')]
		// tagname[contains(@id,''value')]

		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add("abc");
		arr.add(1);
		arr.add(1);
		arr.add(1);
		arr.add("abc");
		arr.add("abcd");
		arr.add("abcd");

		System.out.println("Before removing duplicate elements " + arr);

		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i).equals(arr.get(j))) {
					arr.remove(j);
					// j--;
				}
			}
		}
		System.out.println("After Removing duplicate:" + arr);

	}

}