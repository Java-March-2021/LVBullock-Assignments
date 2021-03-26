public class Mammal{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    //Every mammal should have an energy level (default 100).
    protected int energyLvl = 300;

    //They should all be able to display their energy levels when asked through the displayEnergy method,
    //which should print and return the energy level.

    public int displayEnergy(){
        System.out.printf("\nDisplay Energy Level:  " + CYAN_BOLD_BRIGHT + "%d\n" + RESET, this.energyLvl);
        return energyLvl;
    }

    public Mammal(int energyLvl) {
		this.energyLvl = energyLvl;
	}
}


/*INSTRUCTIONS:
Zoo Keeper: Part Two
The zoo keeper was happy with the work you did and now wants some more help, they have captured a rare specimen. Its default energy is much higher than most mammals, its energy level is 300. It also can do a lot more than climb - it can fly. Moreover, this specimen doesn't eat bananas, it eats humans... and it doesn't throw things, but attacks towns. The zoo keeper has caught a giant Bat and wants your help to track its energy levels.
The bat should be tested by attacking three towns, eating two humans, flying twice, and then displaying its energy. Use the display energy from the superclass!

Objectives:
-Implement packages to namespace your project.
-Implement inheritance.

Tasks:
-Create a Bat class that can fly(), eatHumans(), and attackTown() and has a default energy level of 300.
-For the fly() method, print the sound a bat taking off and decrease its energy by 50.
-For the eatHumans() method, print the so- well, never mind, just increase its energy by 25.
-For the attackTown() method, print the sound of a town on fire and decrease its energy by 100.
-Create a BatTest class to instantiate a bat and have it attack three towns, eat two humans, and fly twice.*/