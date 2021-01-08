
public class Example2 {

	public static void main(String[] args) {
		String s="abcde";
		show(null);

	}
	
	static void show(String s) {
		try {
			System.out.println("First character: " + s.charAt(0));
			
		}catch(NullPointerException e) {
			System.out.println("Error Message");
			System.out.println(e.getMessage());
		}
	}
}

