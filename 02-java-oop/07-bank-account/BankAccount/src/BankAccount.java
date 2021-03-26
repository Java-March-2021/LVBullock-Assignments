import java.util.Random;

//Create a BankAccount class.
public class BankAccount {

	public static final String RESET = "\033[0m";  // Text Reset
	public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
	public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
	public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
 
    //Create a class member (static) that has the number of accounts created thus far.
    public static int numOfAccounts = 0;
    
    //Create a class member (static) that tracks the total amount of money stored in every account created
    public static double allAccountBalances = 0;
    
    //Create a private method that returns a random ten digit account number.
    
	private static String generateAcctNum() {
		String subst = "";
		Random r = new Random();
		for(int i = 0; i < 10; i++) {
			subst += r.nextInt(10);
		}
		return subst;
	}
	
	
	//The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance
   protected String accountNumber;
   private double checkingBalance;
   private double savingsBalance;
   
   //In the constructor, call the private method from above so that each user has a random ten digit account.
	public BankAccount() {
		BankAccount.numOfAccounts += 1;  //In the constructor, be sure to increment the account count
		this.checkingBalance = 0;
		this.savingsBalance = 0;
		this.accountNumber = BankAccount.generateAcctNum();
		
		System.out.println(GREEN_BOLD_BRIGHT + "Checking:  \t" + BankAccount.generateAcctNum() + RESET);
		System.out.println(GREEN_BOLD_BRIGHT + "Savings:   \t" + BankAccount.generateAcctNum() + RESET);

	}
	
	//Create a getter method for the user's checking account balance
	public double getCheckingBalance() {
		return this.checkingBalance;
	}

	//Create a getter method for the user's savings account balance
	public double getSavingsBalance() {
		return this.savingsBalance;
	}
	
	//Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored
	public void depositMoney(double amount, String account) {
		if(account.equals("savings"))
			this.savingsBalance += amount;
		else if(account.equals("checking"))
			this.checkingBalance += amount;
		BankAccount.allAccountBalances += amount;
	}
	
	//Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds
	
	public void withdrawMoney(double amount, String account) {
		boolean sufficientFunds = false;
		if(account.equals("savings")) {
			//check if enough in the account
			if(this.savingsBalance - amount >= 0) {
				sufficientFunds = true;
				this.savingsBalance -= amount;
			}
			else {
				System.out.println(RED_BOLD_BRIGHT +"\n**Withdrawal from savings invalid due to insufficient funds.**" + RESET);
			}
		}
		else if(account.equals("checking")) {
			//check if enough in the account
			if(this.checkingBalance - amount >= 0) {
				sufficientFunds = true;
				this.checkingBalance -= amount;
			}
			else {
				System.out.println(RED_BOLD_BRIGHT + "\n**Withdrawal from checking invalid due to insufficient funds.**" + RESET);
			}
		}
		
		if(sufficientFunds) {
			BankAccount.allAccountBalances -= amount;
		}
	}
	

	
	//Create a method to see the total money from the checking and saving
	public void displayAccountBalance() {
		// %.2f formats decimal to the 10s place (like for money)
		System.out.println(String.format("\t--> Savings Balance:   \t$%.2f \n\t--> Checking Balance: \t$%.2f", this.savingsBalance, this.checkingBalance));
	}
}



/*INSTRUCTIONS:
BankAccount Assignment
We are going to create a BankAccount class. This class will recreate some of the common account transactions that normally occur for a bank account such as displaying your account number, checking and savings amount, total amount. Of course, there are also methods to invoke, such as depositing a check, checking your balance, withdrawing money.

Objectives:
-Practice member variables
-Practice instance methods and getter and setters
-Implement static variables and methods.

Tasks:
-Create a BankAccount class.
-The class should have the following attributes: (string) account number, (double) checking balance, (double) savings balance.
-Create a class member (static) that has the number of accounts created thus far.
-Create a class member (static) that tracks the total amount of money stored in every account created.
-Create a private method that returns a random ten digit account number.
-In the constructor, call the private method from above so that each user has a random ten digit account.
-In the constructor, be sure to increment the account count.
-Create a getter method for the user's checking account balance.
-Create a getter method for the user's saving account balance.
-Create a method that will allow a user to deposit money into either the checking or saving, be sure to add to total amount stored.
-Create a method to withdraw money from one balance. Do not allow them to withdraw money if there are insufficient funds.
-Create a method to see the total money from the checking and saving.
-Users should not be able to set any of the attributes from the class.*/
