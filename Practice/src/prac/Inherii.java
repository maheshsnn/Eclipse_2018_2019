package prac;

class Srinivas 
{
	public static void main(String[] args) 
	{
		hyd h=new hyd();
		h.nn();
	}
}

 class Maheshm{
	public static  void mm(){
	System.out.println("mahesh bethi parent class parent") ;
	}
}
class hyd extends Maheshm{
	public static void nn()	{
	System.out.println("mahesh bethi child class") ;
	}
}
