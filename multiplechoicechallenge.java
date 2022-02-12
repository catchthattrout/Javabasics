import java.util.Scanner;

public class multiplechoicechallenge {
	public static void main(String[] args){
		String question = "What color is an apple?";
		String firstchoice = "Green";
		String secondchoice = "Yellow";
		String thirdchoice = "Red";

		String correctanswer = thirdchoice;

		System.out.println(question);
		System.out.println(firstchoice);
		System.out.println(secondchoice);
		System.out.println(thirdchoice);
		System.out.println("Answer is: ");

		Scanner input = new Scanner(System.in);
		String answer = input.next();
		
		if(correctanswer.equals(answer)) {
			System.out.println("Congratulations! you got this one");
		} else {
			System.out.println("Oops! That's incorrect.. The answer is Red");
		}

	}
}