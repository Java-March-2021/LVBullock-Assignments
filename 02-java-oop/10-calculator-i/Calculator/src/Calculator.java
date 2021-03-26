
public class Calculator {
    public static final String RESET = "\033[0m";  // Text Reset
	public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE

	private double operandOne;
	private double operandTwo;
	private char operation;
	private double result;

	//getters and setters
	public double getOperandOne(double operandOne) {
		return this.operandOne;
	}
	
	public void setOperandOne(double operandOne) {
		this.operandOne = operandOne;
	}
	
	public double getOperandTwo(double operandTwo) {
		return this.operandTwo;
	}
	
	public void setOperandTwo(double operandTwo) {
		this.operandTwo = operandTwo;
	}

	public char getOperation(char operation) {
		return this.operation;
	}
	
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
    public void performOperation(){
        if (this.operation == '+'){
            this.result = operandOne + operandTwo;
        }
        
        if (this.operation == '-'){
            this.result = operandOne - operandTwo;
        }

    }

    public void getResult(){
        System.out.println("\n" + RED_BOLD_BRIGHT + this.operandOne + RESET + " " + this.operation + " " + BLUE_BOLD_BRIGHT + this.operandTwo + RESET + " = " + PURPLE_BOLD_BRIGHT + this.result + RESET);

    }
}


/*Calculator Part I
A client of yours requires a basic calculator for their application. They need a way to run a series of operations and save the result. They only need adding and subtracting functionality right now. They need the method performOperation and getResults to be the methods that run all the operations and return the end result respectively.
- setOperandOne(10.5)
- setOperation("+")
- setOperandTwo(5.2)
- performOperation()
- getResults()
where the result would be 15.7.

Objectives:
- Practice classes and objects.
- Implement a calculator in java.

Tasks:
- Create the Calculator bean that will allow for the user to set operands and operations, then perform them and get the results.
- Have logic for adding and subtracting.*/