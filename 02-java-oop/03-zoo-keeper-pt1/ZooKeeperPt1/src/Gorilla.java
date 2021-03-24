// create a separate class of gorilla
public class Gorilla extends Mammal {

        //Reset
        public static final String RESET = "\033[0m";  // Text Reset

        // Bold High Intensity
        public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
        public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
        public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
        // public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN

        public Gorilla(int energyLvl) {
		super(energyLvl);
    }
    
    //can throw things at people but will lose energy level (-5) whenever this is done.
    public void throwSomething(){
        energyLvl -= 5;
        System.out.printf("Energy Level decreased to:  " + RED_BOLD_BRIGHT + "%d\n" + RESET, this.energyLvl);
    }

    //Eeat Bananas and regain energy level (+10). 
    public void eatBananas(){
        energyLvl += 10;
        System.out.printf("Re-energized to:  " + GREEN_BOLD_BRIGHT + "%d\n"  + RESET,  this.energyLvl);
    }

    //The gorilla should also be able to climb at the expense of energy level (-10).
    public void climb(){
        energyLvl -= 10;
        System.out.printf("Energy Level decreased to:  " + RED_BOLD_BRIGHT + "%d\n" + RESET, this.energyLvl);
    }
}