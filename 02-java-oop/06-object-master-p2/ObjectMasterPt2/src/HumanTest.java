// HumanTest class
public class HumanTest{
    public static void main(String[] args) {
    	
    	 System.out.println("\nLaura Bullock - March 2021 Java Cohort - Object Master Part 2 Assignment - March 17, 2021 \n");

        Human human = new Human();

        human.setStrength(3);
        human.attack(human);

        //Create Ninja, Wizard, and Samurai classes that all extend from the Human class.
        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai = new Samurai();
        Samurai samurai2 = new Samurai();
        Samurai samurai3 = new Samurai();
        Samurai samurai4 = new Samurai();

            
        System.out.println("\n----WIZARD----");
        System.out.println("Intelligence: \t" + wizard.getIntelligence());
        System.out.println("Strength: \t" + wizard.getStrength());
        System.out.println("Stealth: \t" + wizard.getStealth());
        System.out.println("Health: \t" + wizard.getHealth());

        System.out.println("\n----WIZARD HEALS HUMAN----");
        wizard.heal(human);
        System.out.printf("Human's health is now: \t%d\n", human.health);

        System.out.println("\n----WIZARD THROWS FIREBALL AT SAMURAI 1----");
        wizard.fireball(samurai);
        System.out.printf("Samurai's health: \t%d\n", samurai.health);
        System.out.printf("Wizard's health: \t%d\n", wizard.health);

        System.out.println("\n----NINJA STEALS STEALTH FROM SAMURAI 2----");
        ninja.steal(samurai2);
        System.out.printf("Ninja stole stealth: \t%d", samurai2.stealth);
        System.out.printf("\nNinja's stealth: \t%d", ninja.stealth);
        System.out.printf("\nSamurai 2's health:  \t%d\n", samurai2.health);

        System.out.println("\n----NINJA RUNS AWAY----");
        System.out.printf("Ninja's health: \t%d", ninja.health);
        ninja.runAway();
        System.out.printf("\nHealth depleted to: \t%d\n", ninja.health);


        System.out.println("\n----SAMURAI 2 KILLS WIZARD----");
        samurai2.deathBlow(wizard);
        System.out.printf("Samurai 2's health: \t%d\n", samurai2.health);
        wizard.getHealth();
        System.out.printf("Wizard's health: \t%d\n", wizard.health);

        System.out.println("\n----SAMURAI 1 MEDITATES----");
        samurai.meditate();
        System.out.printf("Samurai 1 Restored to full health: \t%d\n", samurai.health);

        System.out.println("\n----HEALTH OF ALL OBJECTS----");
        System.out.printf("Human:   \t%d\n", human.health);
        System.out.printf("Ninja:   \t%d\n", ninja.health);
        System.out.printf("Samurai 1: \t%d\n", samurai.health);
        System.out.printf("Samurai 2: \t%d\n", samurai2.health);
        System.out.printf("Samurai 3: \t%d\n", samurai3.health);
        System.out.printf("Samurai 4: \t%d\n", samurai4.health);
        System.out.printf("Wizard: \t%d\n", wizard.health);

        System.out.println("\n----TOTAL SAMURAI----");
        samurai.howMany();
    }
}