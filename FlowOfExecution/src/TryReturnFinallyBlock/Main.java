package TryReturnFinallyBlock;
// if return in try block and no return in finally block.
// try block will executed followed by finally block
public class Main {
      public static void main(String[] args) {
		  try{
			   System.out.println("try block");
			   return;
		  }catch(Exception e)
		  {
			  System.out.println("catch block");
		  }
		  finally
		  {
			  System.out.println("finally block");
		  }
	}
}
