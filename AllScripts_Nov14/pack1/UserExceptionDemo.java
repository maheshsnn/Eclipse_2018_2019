package pack1;
class UserException extends Exception
{
	String msg;
	UserException()
	{
		
	}
	UserException(String msg)
	{
		this.msg=msg;
	}
	void validateAge(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible for vote");
		}
		else
		{
			try 
			{
				throw new UserException("Not eleible for vote");
			} 
			catch (UserException e) 
			{
				e.printStackTrace();
				//System.out.println(e);
				System.out.println("**** End of the catch block *****");
			}
		}
		System.out.println("**** End of Method *****");
	}
	
}

public class UserExceptionDemo {

	public static void main(String[] args) {
		UserException b=new UserException();
		b.validateAge(10);
		System.out.println("**** End of the program *****");

	}

}
