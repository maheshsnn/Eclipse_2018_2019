package prac;

public class StringBuffers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			      StringBuffer sb = new StringBuffer("hello");
			      sb.append(" mahesh");
			      sb.insert(0, "    Tutorialspoint  ");
			      System.out.print(sb);
			      
			      
		StringBuilder y=new StringBuilder(25);
	//	System.out.println(y.capacity());
		//y.setLength(20);
		y.append("  maheshbethisunnmmmmmm");
		
		for(int i=0;i<=y.length();i+=2 )
		{
		y.setCharAt(i, 'x');
		}
		System.out.println(y);
	//	y.maheshtest();
			   }
			
	public void maheshtest()
	{
		String jmeter =" test data mahesh" ;
	
	
	//.out.println(jmeter.replace("m", "x"));
	//System.out.println(jmeter.replaceAll("a", "t"));
	System.out.println(jmeter.replace("e", "g"));
	
	
	
	}

	}


