
public class Example1 {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		try {
			int ans = a/b;
			System.out.println("Answer: "+ans);
		}catch(ArithmeticException ae) {
			System.out.println("Error Message");
			System.out.println(ae.getMessage());
		}

	}

}
