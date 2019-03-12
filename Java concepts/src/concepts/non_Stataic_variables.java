package concepts;

public class non_Stataic_variables {
	
	 int i=44;
	
	
	public static void main(String[] args) {
		
		
		
		
		non_Stataic_variables ss=new non_Stataic_variables();
		System.out.println(ss.i);
		
		
		
	}
	
	public void mm()
	{
		System.out.println("Non static method" +i); 
		

	}
	
}
