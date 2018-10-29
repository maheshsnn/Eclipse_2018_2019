package prac;




public class  Inheri
{
	public static void main(String[] args) 
	{
		
	Moksha k=new Moksha();
	k.nn();
	k.mm();

	}}


 class  Maheshk extends Inheri{
public static void   mm(){

	{
	System.out.println("parent class mahesh bethi");
		
	}}}
	class Moksha extends Maheshk{
		
	public static void nn(){
	
	{
		System.out.println("child class mahesh bethi");
	}}}

