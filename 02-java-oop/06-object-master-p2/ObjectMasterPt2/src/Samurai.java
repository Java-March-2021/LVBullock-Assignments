//Create Samurai class that extends from the Human class.
public class Samurai extends Human{
    private static int numOfSamurai = 0;
    private static int defaultHealth = 200;

    public Samurai(){
        //Samurai: Set a default health of 200
        this.health = Samurai.defaultHealth;
        Samurai.numOfSamurai++;
    }

    //Samurai: Add a method deathBlow(Human) that kills the other human, but reduces the Samurai's health by half
    public void deathBlow(Human target){
        target.health = 0; //attacks an object and decreases the target's (Human's) health to 0
        this.health = (this.health / 2); //reduces the Samurai's health by half
    }

    //Samurai: Add a method meditate() that heals the Samurai back to full health.
    public void meditate(){
        this.health = Samurai.defaultHealth;
    }

    //Samurai: Add a method howMany() that returns the current number of Samurai.
    public static int howMany() {
        // Samurai.numOfSamurai++;
        System.out.printf("The total number of Samurai is: %d", Samurai.numOfSamurai);
        return Samurai.numOfSamurai;
    }

}