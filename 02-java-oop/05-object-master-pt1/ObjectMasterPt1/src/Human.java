//Create a Human class
public class Human{
    //Add the strength, stealth, and intelligence attributes with a default of 3.
    protected int strength = 3;
    protected int stealth = 3;
    protected int intelligence = 3;
    //Add the health attribute with a default of 100
    protected int health = 100;

    //add setters
    public void setStrength(int strength){
        this.strength = strength;
    }
    public void setStealth(int stealth){
        this.stealth = stealth;
    }
    public void setIntelligence(int intelligence){
        this.intelligence = intelligence;
    }
    public void setHealth(int health){
        this.health = health;
    }

    //add getters
    public int getStrength(){
        return this.strength;
    }
    public int getStealth(){
        return this.stealth;
    }
    public int getIntelligence(){
        return this.intelligence;
    }
    public int getHealth(){
        return this.health;
    }

    //Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.  
    public void attack(Human target){
    System.out.printf("----HUMAN----\n" + "Beginning Health:  %d \n", this.health);
    target.health -= this.strength;
    System.out.printf("Health after attack:  %d", this.health);
    }
}


/*INSTRUCTIONS:
Object Master: Part One
A local D&D club has asked you to help them by creating the objects they might use with a simple Java program to track their players. To start, they would like to have only Humans in this particular campaign. The humans can all select various classes (Wizard, Ninja, Samurai).
They say that the humans should all have four properties: strength, intelligence, stealth, and health. The starting value for each of the properties should be 3, except for health - that should be 100. Each human should also have the ability to attack, where they decrease the health of whatever they attacked by their strength.
They want to see if you can make a class that they could use before anything further, so just implement the human class.

Objectives:
- Implement packages to namespace your project.
- Implement inheritance.

Tasks:
- Create a Human class
- Add the strength, stealth, and intelligence attributes with a default of 3
- Add the health attribute with a default of 100
- Add the attack(Human) method that reduces the health of the attacked human by the strength of the current human.
- Test these methods work using a HumanTest class*/