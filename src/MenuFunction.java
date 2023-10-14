import java.util.Scanner;

// This is a kind of menu class
public class MenuFunction {
	
	// Empty constructor is not essential
	MenuFunction(){}
	
	// Just get menu for us
	protected void menuGetter() {
		boolean isTrue = true;
		
		// There are essential stuff for loop
		// Please do not change anything on them.(selection, scan)
		int selection;
		Scanner scan = new Scanner(System.in);
		while (isTrue) {
			
			// It is just menu
			// You could change there for your desire, if you update
			System.out.println("Welcome the mine Calculator");
			System.out.println("Which mathematical operation do you want to do?");
			System.out.println("1.Addition, 2.Substraction, 3.Division, 4.Mod, 5.Multiplication");
			System.out.print("Selection: ");
			selection = scan.nextInt();
			
			// To access mathematical calculations which are at CalculationFunctions
			CalculationFunctions num;
			
			float result;
			float given_number;
			// There is a switch case for our selection 
			switch (selection) {
			case 1:
				System.out.println("\n----------");
				System.out.print("Please enter number: ");
				given_number = scan.nextFloat();
				num = new CalculationFunctions(given_number);
				System.out.print("Please enter other number: ");
				result = num.additionCalculation(scan.nextFloat());
				if (given_number <= Float.MAX_VALUE) {
					System.out.println("Result: " + result);
					System.out.println("\n----------");
				}
				break;
			case 2:
				System.out.println("\n----------");
				System.out.print("Please enter number: ");
				given_number = scan.nextFloat();
				num = new CalculationFunctions(given_number);
				System.out.print("Please enter other number: ");
				result = num.substractionCalculation(scan.nextFloat());
				if (given_number <= Float.MAX_VALUE) {
					System.out.println("Result: " + result);
					System.out.println("\n----------");
				}
				break;
			case 3:
				System.out.println("\n----------");
				System.out.print("Please enter number: ");
				given_number = scan.nextFloat();
				num = new CalculationFunctions(given_number);
				System.out.print("Please enter other number: ");
				result = num.divisionCalculation(scan.nextFloat());
				if (given_number <= Float.MAX_VALUE) {
					System.out.println("Result: " + result);
					System.out.println("\n----------");
				}
				break;
			case 4:
				System.out.println("\n----------");
				System.out.print("Please enter number: ");
				given_number = scan.nextFloat();
				num = new CalculationFunctions(given_number);
				System.out.print("Please enter other number: ");
				result = num.modCalculation(scan.nextFloat());
				if (given_number <= Float.MAX_VALUE) {
					System.out.println("Result: " + result);
					System.out.println("\n----------");
				}
				break;
			case 5:
				System.out.println("\n----------");
				System.out.print("Please enter number: ");
				given_number = scan.nextFloat();
				num = new CalculationFunctions(given_number);
				System.out.print("Please enter other number: ");
				result = num.multiplyCalculation(scan.nextFloat());
				if (given_number <= Float.MAX_VALUE) {
					System.out.println("Result: " + result);
					System.out.println("\n----------");
				}
				break;
			default:
				System.out.println("Unknown command is entered. Therefore, system's gone shutdown in 5 seconds");
				isTrue = false;
				break;
			}
		}
		
		System.out.print("Thanks for selecting us ;)");
		// This last code really essential for leaking, if our code still continue running
		scan.close();
	}
}

/*
 * If you do not understand why we ought not to initialize constructor,
 * please just check any website which is about Constructor.
 * 
 */
