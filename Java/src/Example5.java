
public class Example5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=0;
		int arr[] = {1,2,3};
		try {
		int div= a/b;
		System.out.println(div);
		System.out.println(arr[6]);
		
		}catch(ArithmeticException ae) {
			System.out.println("Error Message");
			System.out.println(ae.getMessage());
		}
		catch(IndexOutOfBoundsException ie) {
			System.out.println("Error Message");
			System.out.println(ie.getMessage());
		}

	}

}
