package prac;

public class Thiskeywrd {
	
	int enm ;
	int ename ;
	int eadd;
	
	Thiskeywrd(int enm,int ename,int eadd)
	{
		
		this.eadd=eadd ;
		this.ename=ename;
		this.enm=enm;
	}
	
	void show()
	{
		System.out.println(enm+eadd+ename);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Thiskeywrd j=new Thiskeywrd(1,2,3);
   //j.mm(1, "mahesh", "eadd");
   j.show();
	}

}
