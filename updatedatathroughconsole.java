import java.util.Scanner; // imports a scanner class to use its privilages

public class updatedatathroughconsole{
	public static void main(String args[]){
		String StudentFirstName = "Sumanth";
		String StudentLastName = "Muhammad";
		double StudentGPA = 2.9;
		System.out.println(StudentFirstName + StudentLastName + " has GPA of" + StudentGPA);
		System.out.println("How much GPA now?");
		Scanner input = new Scanner(System.in); // Scanner is datatype itself for inputting data, we create a new scanner to user input
		StudentGPA = input.nextDouble();   // assigning the new value to old variable
		System.out.println("Updated GPA is: " + StudentGPA);
		

	}
}