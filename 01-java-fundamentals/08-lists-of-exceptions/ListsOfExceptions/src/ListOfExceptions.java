import java.util.ArrayList;

public class ListOfExceptions{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN

    public static void main(String[] args) {
    	
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Lists of Exceptions Assignment - March 12, 2021 \n");

        //Create ArrayList
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World -- Welcome to this beautiful new day.");
        myList.add(48);
        myList.add("Goodbye for today, yet another new day awaits your arrival. --> See you tomorrow.");
        System.out.println(CYAN_BOLD_BRIGHT + myList + RESET);

        //Use try/catch blocks to handle the exceptions
            for(int i = 0; i < myList.size(); i++){
                //Try to cast each element to an Integer
            try{
                Integer castedValue = (Integer) myList.get(i); //can not pass the 3 strings to an integer, should should an error for each occurrence. 
                System.out.println(CYAN_BOLD_BRIGHT + "\n" + castedValue + RESET);
            }
            catch(Exception error){
                System.out.println(RED_BOLD_BRIGHT + "\nEXCEPTION ERROR: \n" + error + RESET);
            }
        }
    }
}

/*
Your new PM knows you don't know Java too well. She wants you to familiarize yourself with generics and exceptions and figure out exactly how they work. First, she wants you to make an ArrayList with both numbers and strings in it.

ArrayList<Object> myList = new ArrayList<Object>();
myList.add("13");
myList.add("hello world");
myList.add(48);
myList.add("Goodbye World");
You will loop through the list and try assigning each item to an int variable. To do this, you will also need to cast your list item as an Integer; you can do this like this:

for(int i = 0; i < myList.size(); i++) {
    Integer castedValue = (Integer) myList.get(i);
}
After you have set up this code, try running it. It should throw a ClassCastException. Change the program above to utilize exception handling to print out the error messages, the index of the ArrayList where the error occurred, and the value of the object that triggered the error. The program should continue after printing this to the console.

Objectives:
- Implement exception handling.

Tasks:
- Create ArrayList
- Try to cast each element to an Integer
- Use try/catch blocks to handle the exceptions


NOTE:  
In this case, if there is no try/catch, will throw the following error:
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
at Exceptions.main(Exceptions.java:18)*/