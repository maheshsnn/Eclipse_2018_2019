package prac ;

class Javac {

	public static void main(String[] args) 
	{
		nag h=new nag();
		h.nn();
	}

}


 class Mallik{
	public static  void mm(){
	System.out.println("mahesh bethi parent class parent") ;
	}
}
class nag extends Mallik{
	public static void nn()	{
	System.out.println("mahesh bethi child class") ;
	}
}

