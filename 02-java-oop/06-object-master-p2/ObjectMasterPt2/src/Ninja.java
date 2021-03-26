//Create Ninja class that extends from the Human class.
public class Ninja extends Human{
    public Ninja(){
        //Ninja: Set default stealth to 10
        this.stealth = 10;
    }

    //Ninja: Add a method steal(Human) that takes the amount of stealth the ninja has, removes it from the other human's health, and adds it to the ninja's
    public void steal(Human target){
        target.health -= this.stealth; //takes health from another human by their stealth level
        this.health += this.stealth;
    }

    //Ninja: Add a method runAway() that decreases their health by 10
    public void runAway(){
        this.health -= 10;  //run away decreases ninja's health by 10
    }
}