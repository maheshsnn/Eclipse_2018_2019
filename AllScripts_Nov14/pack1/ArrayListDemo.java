package pack1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("X");
		al.add("Y");
		al.add("Z");
		System.out.println("No of elements:"+al.size());
		System.out.println("**** Collection Elements are ****");
		/*Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		for(String s:al)
		{
			System.out.println(s);
		}
		

	}

}
