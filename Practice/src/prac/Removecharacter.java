package prac;

public class Removecharacter {
	
	public void removechar()
	{
		String st="this is mahesh" ;
		System.out.println(removecharacat(st,3));
	}

	private String removecharacat(String s, int pos) {
		// TODO Auto-generated method stub
		return s.substring(0,pos )+s.substring(pos+ 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Removecharacter sh=new Removecharacter();
		sh.removechar();
		

	}

}
