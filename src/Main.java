/*
 * First Prototype 
 * Time: 10/15/2023 2:10 
 * 
 */

import java.util.InputMismatchException;

//Everything just turn around here.
public class Main {

	public static void main(String[] args) throws Exception{
		
		// It is essential for looping
		boolean isContinue = true;
		MenuFunction calculator = new MenuFunction();
		while(isContinue){
			// There is for InputMismacthException
			try {
				calculator.menuGetter();
			}
			catch (InputMismatchException e) {
				System.out.println("Unknown number type entered. Therefore, system's gone restart in 5 seconds");
				System.out.println("\n----------");
			}
			finally {
				isContinue = true;
				// It is just for delay for your desire. 
				// You can change time but you need to check menuGetter() inside
				Thread.sleep(5000);
			}
		}
	}
}
