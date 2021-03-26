public class BatTest{
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";

    public static void main(String[] args) {
    	
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - ZooKeeper Part 2 Assignment - March 15, 2021 \n");

        Bat giantBat = new Bat(300);
        giantBat.displayEnergy();
        System.out.println("-------------------------------------------------------------------------------------------------");

        //attack 3 towns
        System.out.println(CYAN_BOLD_BRIGHT + "\nATTACK TOWN:" + RESET);
        giantBat.attackTown();
        giantBat.attackTown();
        giantBat.attackTown();

        //eat 2 humans
        System.out.println(CYAN_BOLD_BRIGHT + "\nEAT HUMANS:" + RESET);
        giantBat.eatHumans();
        giantBat.eatHumans();

        //fly twice
        System.out.println(CYAN_BOLD_BRIGHT + "\nFLY:" + RESET);
        giantBat.fly();
        giantBat.fly();
        System.out.println("\n-------------------------------------------------------------------------------------------------");
    
        //Print the giantBat's energy level.
        if(giantBat.energyLvl <= 0){
            System.out.println(CYAN_BOLD_BRIGHT + "\nHALLELUJAH!!! GIANT BAT IS DEAD -- YAAAAAAAAY!" + RESET);
            giantBat.displayEnergy();
        }

        else {
            giantBat.displayEnergy();
        }
    }
}