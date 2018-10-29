package fileInputOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Enumeration;
import java.util.Vector;
class reg 
{
	public static void main(String[] args) 
	{


Vector v=new Vector();
v.add(2);
v.add(3);
v.add(4);
v.add(5);
v.add(6);

System.out.println(v); 

Enumeration e=v.elements();

while(e.hasMoreElements())
		{

Integer I=(Integer)e.nextElement();
if(I%2==0)
{
System.out.println(I);

}

}




		/*Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abcabdabdab");

         int count=0;
		while(m.find())
		{
		
		count++;

		System.out.println(m.start()+"..."+m.end()+"..."+m.group());
		}
		System.out.println("no of occurences are"+count);*/


}
}