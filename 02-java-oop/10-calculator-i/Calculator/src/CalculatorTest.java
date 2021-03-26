
public class CalculatorTest {

	public static void main(String[] args) {
		
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Advanced OOP - Calculator Assignment - March 19, 2021 \n");

		// TODO Auto-generated method stub
        Calculator calculation = new Calculator();
        calculation.setOperandOne(50.55);
        calculation.setOperation('+');
        calculation.setOperandTwo(10.23);
        calculation.performOperation();
        calculation.getResult();
	}

}
