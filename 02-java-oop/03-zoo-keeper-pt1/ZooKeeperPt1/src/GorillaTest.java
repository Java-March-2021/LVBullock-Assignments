public class GorillaTest{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN

    public static void main(String[] args) {
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - ZooKeeper Part 1 Assignment - March 15, 2021 \n");


        Gorilla gorilla = new Gorilla(100);
        System.out.println(CYAN_BOLD_BRIGHT + "\nBEGINNING ENERGY LEVEL:" + RESET);
        gorilla.displayEnergy();
        System.out.println("-------------------------------------------------------------------------------------------------");

        //She asks that you demonstrate that the class works as expected by having the gorilla throw things 3 times.
        System.out.println(CYAN_BOLD_BRIGHT + "\nTHROW SOMETHING:" + RESET);
        gorilla.throwSomething();
        gorilla.throwSomething();
        gorilla.throwSomething();

        //eat bananas twice
        System.out.println(CYAN_BOLD_BRIGHT + "\nEAT BANANAS:" + RESET);
        gorilla.eatBananas();
        gorilla.eatBananas();

        //Climb once
        System.out.println(CYAN_BOLD_BRIGHT + "\nCLIMB:" + RESET);
        gorilla.climb();
        System.out.println("-------------------------------------------------------------------------------------------------");
    
        //Print the gorilla's energy level.
        System.out.println(CYAN_BOLD_BRIGHT + "\nENERGY LEVEL AFTER ACTIVITIES:" + RESET);
        gorilla.displayEnergy();
    }
}