package concepts;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//File s=new File("E:\\mahesh.txt");
//s.createNewFile();
//StringBuffer sb=new StringBuffer("mahesh");
StringBuilder sb=new StringBuilder("mahesh");

for(int i=2;i<=sb.length();i+=2)
{
sb.insert(i, "x");
}
System.out.println(sb);


//
//Scanner u=new Scanner(System.in);
//System.out.println("enter yourname");
//u.nextLine();
//System.out.println("enter your age");
//u.next();
	}

}
