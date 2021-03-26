
public class PhoneTester {

	public static void main(String[] args) {
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - OOP - Phone Assignment - March 19, 2021 \n");

		
		// TODO Auto-generated method stub
		Galaxy s20 = new Galaxy("S20", 99, "Sprint", "Starlight");
		IPhone iphone12 = new IPhone("12", 100, "Verizon", "Reflection");
		
		s20.displayInfo();
		System.out.println(s20.ring()) ;
		System.out.println(s20.unlockPhone());

		
		iphone12.displayInfo();
		System.out.println(iphone12.ring());
		System.out.println(iphone12.unlockPhone());

	}

}
