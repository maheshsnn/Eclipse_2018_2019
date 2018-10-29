package prac;

public class Constructorcl {

	// int i,j,k ;

	Constructorcl(int i, int j, int k) {
		this(i, j);

		System.out.println(k);
	}

	Constructorcl(int i, int j) {
		this(i);
		System.out.println(j);
	}

	Constructorcl(int i) {
		// this(j);
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructorcl t = new Constructorcl(10, 20, 30);
		// Constructorcl e=new Constructorcl(10);

	}

}
