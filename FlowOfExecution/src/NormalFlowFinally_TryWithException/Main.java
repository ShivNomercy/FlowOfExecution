package NormalFlowFinally_TryWithException;
//if exception is there and no return statement then catch block
//then finally block will executed
public class Main {
    public static void main(String[] args) {
		    int x,y,z;
		       x = 10;
		       y = 0;
		       try{
		    	   z=x/y;
		    	   
		       }catch(Exception e)
		       {
		    	   System.out.println("catch block"+e);
		       }
		       finally
		       {
		    	   System.out.println("finally block");
		       }
	}
}
