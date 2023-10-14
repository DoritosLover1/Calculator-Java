// CalculationFunctions just includes functions of basic mathematical operation
public class CalculationFunctions {
	
	private float number;
	
	// There is constructor of class
	CalculationFunctions(float num){
		this.number = num;
	}
	
	// These are basic functions which are just in any calculator
	protected float additionCalculation(float number) {
		return this.number += number;
	}
	protected float substractionCalculation(float number) {
		return this.number -= number;
	}
	protected float divisionCalculation(float number) {
		return this.number /= number;
	}
	protected float modCalculation(float number) {
		return this.number %= number;
	}
	protected float multiplyCalculation(float number) {
		return this.number *= number;
	}
}
