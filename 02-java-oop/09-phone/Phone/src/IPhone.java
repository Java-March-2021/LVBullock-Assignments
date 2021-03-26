/*Create an IPhone classes; should extend from the Phone abstract class and implement the Ringable interface.*/

public class IPhone  extends Phone implements Ringable {

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN


    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return getRingTone();
    }
    @Override
    public String unlockPhone() {
        return GREEN_BOLD_BRIGHT + "Unlocked:  Facial recognition accepted\n" + RESET;
    }
    @Override
    public void displayInfo() {
    	System.out.printf(CYAN_BOLD_BRIGHT + "**********" + getClass().getSimpleName() + " %s**********\n" + RESET, versionNumber);
    	System.out.printf("Carrier:   \t%s\n", carrier);
    	System.out.printf("Battery:  \t%d\n", batteryPercentage);
    	System.out.print("Ringtone:  \t");

    }
}