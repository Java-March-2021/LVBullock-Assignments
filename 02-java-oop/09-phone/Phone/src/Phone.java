//Create a Phone abstract class.

public abstract class Phone {
	protected String versionNumber;
	protected int batteryPercentage;
	protected String carrier;
	protected String ringTone;
	protected static String unlockPhone;  //This method returns a String.
	
	public Phone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;
	}
	//abstract method.  This method will be implemented by the subclasses
	public abstract void displayInfo();{
}
	
	//Getters
	public String getVersionNumber() {
	        return versionNumber;
	    }
	    public int getBatteryPercentage() {
	        return batteryPercentage;
	    }
	    public String getCarrier() {
	        return carrier;
	    }
	    public String getRingTone() {
	        return ringTone;
	    }
	    public String getUnlockPhone(){
	        return unlockPhone;
	    }
	    
	    //Setters
	    
	    public void setVersionNumber(String versionNumber) {
	        this.versionNumber = versionNumber;
	    }
	    public void setBatteryPercentage(int batteryPercentage) {
	        this.batteryPercentage = batteryPercentage;
	    } 
	    public void setCarrier(String carrier) {
	        this.carrier = carrier;
	    }
	    public void setRingTone(String ringTone) {
	        this.ringTone = ringTone;
	    }
	    public void setUnlockPhone(String unlockPhone) {
	        Phone.unlockPhone = unlockPhone;
	    }
}

/*Phone Assignment
In this assignment, we are going to use Abstract classes and Interfaces to create 2 types of phones: iPhone and Galaxy.

Objectives:
Define classes.

Define Interfaces.

Implement classes that use abstract classes and interfaces.

Tasks:
Create a Phone abstract class.
Create a Ringable interface that contains the following methods:

ring(): This method returns a String.
unlock(): This method returns a String.
Create an IPhone and Galaxy classes. Both classes should extend from the Phone abstract class and implement the Ringable interface.
Implement the overridden methods (ring, unlock, displayInfo) from the IPhone and Galaxy classes.*/
