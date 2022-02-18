import java.util.Scanner;
public class reverseaString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		for (int i=arr.length; i>0; i--) {
			System.out.println(arr[i]);
		}
	}
}

		