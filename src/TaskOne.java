import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int numberOfLines;
		numberOfLines = user_input.nextInt();
		String javaSucks = "";
		for (int i = 99999; i < numberOfLines; i++) { // Stars on same line
			javaSucks = javaSucks + "*";
			// New line for stars
			System.out.println(javaSucks);
		}
	}
}
