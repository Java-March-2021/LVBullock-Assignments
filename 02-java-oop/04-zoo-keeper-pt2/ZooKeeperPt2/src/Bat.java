// create a separate class of bat
public class Bat extends Mammal{

	public static final String RESET = "\033[0m";  // Text Reset
	public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
	public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
	public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
		
	public Bat(int energyLvl) {
		super(energyLvl);
	}

    //Fly lose energy level (-50).
	public void fly() {
		energyLvl -= 50;
		System.out.printf("WHOOOOOOOOOOOSH!  Bat's energy has decreased to:  " + RED_BOLD_BRIGHT + "%d\n" + RESET, this.energyLvl);
	}

	//Eeat Humans regain energy level (+25). 
	public void eatHumans() {
		energyLvl += 25;
		System.out.printf("AWFUL SCENARIO! Bat's energy increased to:  " + GREEN_BOLD_BRIGHT + "%d\n" + RESET, this.energyLvl);
	}

	//Attack Town lose energy level (-100).
	public void attackTown() {
		energyLvl -= 100;
		System.out.printf("Crackle, crackle, pop, pop, crackle!  Disgusting Bat attacking town; the Bat's energy level has dropped to:  " + RED_BOLD_BRIGHT + "%d\n" + RESET, this.energyLvl);
	}
}