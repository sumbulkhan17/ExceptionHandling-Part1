
public class Example3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		try {
			System.out.println(arr[9]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Error Message");
			System.out.println(e.getMessage());
		}

	}

}
