package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("X");
		ll.add("Y");
		ll.add("Z");
		ll.add("X");
		System.out.println("No of elements:"+ll.size());
		System.out.println("**** Collection Elements are ****");
		/*Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for(String s:ll)
		{
			System.out.println(s);
		}
		

	}

}
