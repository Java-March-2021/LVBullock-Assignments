public class PythagoreanTheoremTest {
    public static void main(String[] args) {

        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Pythagorean Theorem Assignment - March 11, 2021 \n");

        PythagoreanTheorem hypSideC = new PythagoreanTheorem(); //instantiate a new PythagoreanTheorem object -- note:  This needs to be the same name as the class in PythagoreanTheorem.java  
        double hypotenuse = hypSideC.calculateHypotenuse(3,4); //calling the calculateHypotenuse method from the PythagoreanTheorem.java -- 3 and 4 are the values entered for sideA and sideB
        System.out.println("The hypotenuse (sideC) is: " + hypotenuse);  //prints the result for sideC
    }  
}

//NOTE:
//Remember to compile and run the "test" or "controller" file.  During compile, it will automatically create the .class file for both.



//- Create a PythagoreanTest file that will instantiate a new Pythagorean object and call the calculateHypotenuse method.*/