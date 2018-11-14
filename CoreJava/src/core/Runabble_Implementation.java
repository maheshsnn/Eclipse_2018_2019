package core;

public class Runabble_Implementation {
	
	
public static void main(String[] args) throws Exception {
	
	
	Runnable a=() ->{
			for(int i=0;i<10;i++) {
				
			try {
			Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hii");
			}
			};
	Runnable b=() ->		{
			
			for(int i=0;i<10;i++)
			{
			try {
						Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			

		System.out.println("Hello");}

		};
	
	Thread t1=new Thread(a);
	Thread t2=new Thread(b);
	
	t1.start();
	t2.start();
	
	
	t1.join();
	t2.join();
	
	
} 

	

}

/*class A implements Runnable
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
}*/
/*
class B implements Runnable
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
}
*/