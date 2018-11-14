package core;

import com.sun.org.apache.xml.internal.utils.MutableAttrListImpl;

public class Multithreading {
	
	
	public static void main(String[] args) throws Exception {
		
		
		Thread t1=new Thread();
		Thread t2=new Thread();
				
	    /*A a=new A();
		B b=new B();
		
		a.start();
		Thread.sleep(10);
		b.start();
		
		a.join();
		b.join();*/
		
		
		
	}

}

/*class A extends Thread
{
	

	public void run()
	{
		for(int i=0;i<10;i++) {
			
		try {
		Thread.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hii");
		}
	}
}

class B extends Thread
{
	
public void run()
{
	
	for(int i=0;i<10;i++)
	{
	try {
				Thread.sleep(1000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	

System.out.println("Hello");}

}
}*/
