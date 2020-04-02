//Here is the provided basic calculator JAVA program
//Calculations :- Addition, Subtraction, Multiplication, Division, Power and Modulo

//scanner class to take input from the user
import java.util.Scanner; 

//class for basic calculator
public class Calculator {

	private static Scanner scanner;

	public static void main(String[] args) {
		//loop to run the calculator continuously
		while (true)
		{
			//for the input from user
			scanner = new Scanner(System.in);
			System.out.println("Select from the following choices-"); 
			System.out.println("1 for Addition");
			System.out.println("2 for Subtraction");
			System.out.println("3 for Multiplication");
			System.out.println("4 for Division");
			System.out.println("5 for Power");
			System.out.println("6 for Modulo");
			System.out.println("0 for EXIT\n");
			System.out.println("Enter your choice:");
			
			//take the choice as an input from user
			int user_choice = scanner.nextInt();
			
			/*
			 * if user choose 0 (choice==0) System.out.println("EXIT"); System.exit(0);
			 */
			if (user_choice >= 1 && user_choice <= 6) {
				
				//take first number as an input
				System.out.println("Enter the first number:");
				double number1 = scanner.nextInt();
				
				//take second number as an input
				System.out.println("Enter the second number:");
				double number2 = scanner.nextInt(); 
				
				//Initialize an output variable
				double result = 0; 

				//switch statement for the operator check
				switch (user_choice) { 
				
				//case 1 for Addition
				case 1:
					result = number1 + number2;
					System.out.println("The Addition is");
					break;
				
				//Case 2 for Subtraction
				case 2:
					result = number1 - number2;
					System.out.println("The Subtraction is");
					break;
					
				//Case 3 for Multiplication
				case 3:
					result = number1 * number2;
					System.out.println("The Multiplication is");
					break;
				
				//Case 4 for Division
				case 4:
					result = number1 / number2;
					System.out.println("The Division is");
					break;
					
				//Case 5 for Power
				case 5:
					result = Math.pow(number1, number2);
					System.out.println("The Power is");
					break;
					
				//Case 6 for Modulo
				case 6:
					result = number1 % number2;
					System.out.println("The Modulo is");
					break;

				/*case 0:
					System.out.println("Safe Exit");
					System.exit(0);
					break;*/

				/*
				 * default:
				 * System.out.println("You have entered incorrect operation");
				 */

				}

				System.out.println("" + result);
			} 
			
			//else it will check the operator either to exit or show error message
			else { 
				if (user_choice == 0) {
					System.out.println("EXIT");
					
					//exit the program if entered 0
					System.exit(0); 
				} 
				
				else {
					//print wrong choice and continue the program in loop
					System.out.println("You have entered wrong choice"); 
				}
			}
		}
	}
}

//Thank You
//Deep Patel