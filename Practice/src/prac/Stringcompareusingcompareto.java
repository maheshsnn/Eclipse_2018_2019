package prac;

public class Stringcompareusingcompareto {
	
	
	
	public void compareto()
	{
		
		String str="Hello2D4y";
		String strmm="hello2d4y";
		String  strthree="mahesh";
		System.out.println(str.compareTo(strmm));
		System.out.println(str.compareTo(strthree));
	}
public void equals()
{
	String str="mahesh";
	String strtwo="MAHESH";
	String mah=new String("mahesh");
//	System.out.println(str.compareTo(strtwo));
	System.out.println("compare to string =" +str.equals(strtwo));
		System.out.println(str.equals(mah));
	System.out.println(strtwo.equals(mah));	
}

public void equalsopertaor()
{
	String s1="mahesh" ;
	String s2="MAHESH";
	String s3="mahesh" ;
	
	System.out.println(s1==s2);
	System.out.println(s2==s3);
	System.out.println(s3==s1);
	
	
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 Stringcompareusingcompareto x=new  Stringcompareusingcompareto();
		 x.equalsopertaor();
		// x.equals();
		// x.compareto();

	}
	
	

}
