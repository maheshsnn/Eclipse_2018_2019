package pack1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("X");
		hs.add("Y");
		hs.add("Z");
		hs.add("X");
		System.out.println("No of elements:"+hs.size());
		System.out.println("**** Collection Elements are ****");
		/*Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for(String s:hs)
		{
			System.out.println(s);
		}
		

	}

}
