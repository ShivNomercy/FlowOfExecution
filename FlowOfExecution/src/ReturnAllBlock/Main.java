package ReturnAllBlock;
// if there is return statement in all the blocks either exception 
// is there or not doesn't matter only finally block will executed
// i. e ==> 999
public class Main {
      public static void main(String[] args) {
		
    	  System.out.println(M1());
}
  public static int M1()
  {
	try{
	return 777;
	}catch(Exception e)
	{
		return 888;
	}
	finally
	{
	return 999;
	}
	  
  }
      
      
}
