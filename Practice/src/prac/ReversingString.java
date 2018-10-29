package prac;

public class ReversingString {
	
	public void reversingString()
	{
		
		String str="mahesh" ;
		char[] rev=str.toCharArray();
		for(int i=rev.length-1 ;i>=0 ;i--)
		{
			System.out.print(rev[i]);
			
		}
		System.out.println("/////////////");
		}
	
		public void printingarrey()
		{
			char[] mahesh={'m','a','h'} ;
			for (int i=mahesh.length-1 ;i>=0;i--)
			{
				System.out.println(mahesh[i]);
			}
//			for(char ac:mahesh)
//			{
//				System.out.println(ac);
//			}
		}
		
		public void stringrev()
		{
			StringBuffer mah=new StringBuffer("maheshbethi") ;
			
			System.out.println(mah.reverse());
			}
					
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReversingString hd=new ReversingString();
	   hd.reversingString();
		hd.printingarrey();
		hd.stringrev();
		

	}

}
