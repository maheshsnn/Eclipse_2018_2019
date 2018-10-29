package prac;

public class Latpositionofstring {
	
	public void positionstring()
	{
		String str="Helloworld,mahesh" ;
		System.out.println(str.charAt(3));
		System.out.println(str.lastIndexOf("mahesh"));
		System.out.println(str.lastIndexOf("r"));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Latpositionofstring st=new Latpositionofstring() ;
		st.positionstring();
	}

}
