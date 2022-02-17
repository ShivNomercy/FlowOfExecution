package NormalFlowFinally_Try;
// if there no exception and no return statement its Normal flow.
// 1st try block then finally will execute.

public class Main {

	public static void main(String[] args) {
		try{
			System.out.println("try block");
		}catch(Exception e)
		{
			System.out.println("catch block");
		}
		finally
		{
			System.out.println("Finally..Block");
		}

	}

}
