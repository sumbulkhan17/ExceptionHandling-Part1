
public class Example6 {

	public static void main(String[] args) {
		
		try{  
			   int data=25/5;  
			   System.out.println(data);  
			   System.out.println("Last line of first try block");
		  }  
		  catch(NullPointerException e){
			  System.out.println(e);
			  System.out.println("Last line of first catch block");
		  }  
		  finally{
			  System.out.println("Executed frst finally block");
		  } 
		
		try{  
			   int ans=25/0;  
			   System.out.println(ans);  
			   System.out.println("Last line of second try block");
		  }  
		  catch(ArithmeticException ae){
			  System.out.println(ae.getMessage());
			  System.out.println("Last line of second catch block");
		  }  
		  finally{
			  System.out.println("Executed second finally block");
		  } 
	}
}
