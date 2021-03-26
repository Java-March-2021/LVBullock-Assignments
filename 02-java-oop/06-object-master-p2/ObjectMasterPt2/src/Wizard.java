//Create Wizard class that extends from the Human class.
public class Wizard extends Human{
    public Wizard(){
        //Wizard: Set default health to 50
        this.health = 50;
        //Wizard: Set default intelligence to 8
        this.intelligence = 8;  
    }

    //Wizard: Add a method heal(Human) that heals the other human by the wizard's intelligence
    public void heal(Human target){
        target.health += this.intelligence; //heals whomever it was cast on for an amount equal to the wizard's intelligence
    }

    //Wizard: Add a method fireball(Human) that decreases the other human's health by the wizard's intelligence * 3
    public void fireball(Human target){
        target.health -= this.intelligence * 3; //decreases the health of the target by 3 * the wizard's intelligence
    }
}