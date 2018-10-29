package prac;

public class StringReplaceEverySecondletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str=new StringBuilder("MaheshBethi");
		
		for(int i=2;i<=str.length();i+=2)
		{
		str.setCharAt(i, 'x');
		}
		System.out.println(str);
	}	
	}
