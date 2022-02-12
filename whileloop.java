import java.util.Scanner;
public class whileloop {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); // used to make console ask us to input
		boolean isOnRepeat = true; // setting the boolean variable to true so the song will play repeatedly at starting
		while(isOnRepeat) { // while the boolean variable is true
			System.out.println("Playing current song");
			System.out.println("Would you like to take this song off repeat? If so, answer yes");
			String userInput = input.next(); // giving userinput by storing it in userInput variable with datatype string,because "yes" is a string
			if(userInput.equals("yes")) { // checking if the userInput is yes,if yes then the next song will be played...
				isOnRepeat = false; //...by setting the boolean to false to stop current song and play the next one
			}
		}
		System.out.println("Playing the next song");
	}
}