public class StringManipulatorController{

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";


    public static void main(String[] args){
    	
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - String Manipulation Assignment - March 12, 2021 \n");


	            //***********String trimAndConcat(String, String)************/
	    StringManipulator manipulator1 = new StringManipulator();
	    String str = manipulator1.trimAndConcat("     Hello     ", "     World     ");
	    System.out.println("\n***********Integer getIndexOrNull(String, char)************\n");
	    System.out.println("Trim both input strings and then concatenate them.");
	    System.out.println("Before:  " + ANSI_RED + "     Hello     " + "      World     " + ANSI_RESET);
	    System.out.println("After:  " + ANSI_GREEN + str + ANSI_RESET + "\n");
	
	
	//***********Integer getIndexOrNull(String, char) ************/
	
	    StringManipulator manipulator2 = new StringManipulator();
	    char letter = 'o';
	    String a1 = manipulator2.getIndexOrNull("Coding", letter); // o is at index/position 1
	    String b1 = manipulator2.getIndexOrNull("Hello World", letter); // o is at index/position 4
	    String c1 = manipulator2.getIndexOrNull("Hi", letter);  //o does not exist in this, should get null
	    System.out.println("\n***********Integer getIndexOrNull(String, char)************\n");
	    System.out.println("The letter 'o' is found at index " + ANSI_GREEN + a1 + ANSI_RESET + " in 'Coding'."); // 1
	    System.out.println("The first occurrence of the letter 'o' is found at index " + ANSI_GREEN + b1 + ANSI_RESET + " in 'Hello World'."); // 4
	    System.out.println(ANSI_RED + c1 + ANSI_RESET + " --> The letter 'o' does not appear in 'Hi'.\n"); // null
	
	
	//***********Integer getIndexOrNull(String, String) ************/
	
	    StringManipulator manipulator3 = new StringManipulator();
	    String word = "Hello";
	    String subString = "llo";
	    String notSubString = "world";
	    String a2 = manipulator3.getIndexOrNull(word, subString); //get the index position of the substring "llo" in the word "Hello"
	    String b2 = manipulator3.getIndexOrNull(word, notSubString); //"world" is not found in the word "Hello"
	    System.out.println("\n***********Integer getIndexOrNull(String, String)************\n");
	    System.out.println("The subString 'llo' begins at index " + ANSI_GREEN + a2 + ANSI_RESET + " in the word 'Hello'."); // 2
	    System.out.println(ANSI_RED + b2 + ANSI_RESET + " --> The word 'world' does not appear in 'Hello'."); // null
	    System.out.println();
	
	//***********String concatSubstring(String, int, int, String)************/
	    StringManipulator manipulator4 = new StringManipulator();
	    String word1 = manipulator4.concatSubstring("Hello", 1, 2, "world");
	    System.out.println("\n***********String concatSubstring(String, int, int, String)************\n");
	    System.out.println("Strip 'e' from 'Hello' and add to beginning of 'world', to get: " + ANSI_GREEN + word1 + ANSI_RESET); // eworld
	    }
	}
	
	//Create a StringManipulatorTest to test all the methods above.
