public class ProjectTest{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    
    public static void main(String[] args){
    	
    System.out.println("\nLaura Bullock - March 2021 Java Cohort - Project Class Assignment - March 15, 2021 \n");


    // Create a ProjectTest file that will test all the functionality
    Project emptyProject = new Project();
    Project javaCard = new Project("Java Concepts", "10 slimline greeting cards with envelopes in sturdy matchbox style packaging.  Cards have java concepts stamped in background, embellished with and cup dimensional ", 15.75);
    Project pythonCard = new Project("Python Concepts", "20 Gatefold greeting cards with envelopes in sturdy acetate packaging.  Cards have python concepts stamped in background, embellished with Monty Python dimensional.", 20.25);
    Project webFunCard = new Project("Web Fundamentals Concepts", "40 Web Fundamentals notecards with envelopes in sturdy packing.  Notecards have web fundamentals concepts stamped in background, embellished with Coding Dojo dimensional.", 10.55);

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 1  -- Empty Project, should print 'null.'" + RESET);
    System.out.println(RED_BOLD_BRIGHT + emptyProject.getName() + RESET); //should print null for an empty project

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 2 -- Should print the name of the project only." + RESET);
    System.out.println(javaCard.getName()); //prints only the name of the javaCard project.  Constructor 2
    System.out.println(pythonCard.getName()); //prints only the name of the pythonCard project.
    System.out.println(webFunCard.getName()); //prints only the name of the webFunCard project.

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Constructor 3 -- Should print the name of the project and the description." + RESET);
    System.out.println(javaCard.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for javaCupQuilt
    System.out.println(pythonCard.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for montypythonCard
    System.out.println(webFunCard.elevatorPitch()); //invokes  elevatorPitch() method of Project.java -- Print the elevator pitch for WebFunWorldQuilt

    System.out.println("\n" + CYAN_BOLD_BRIGHT + "Optional Challenge 1 -- Should print the name of the project, initial cost in parenthesis, and the description." + RESET);
    System.out.println(javaCard.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for javaConceptsQuilt
    System.out.println(pythonCard.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for pythonConceptsQuilt
    System.out.println(webFunCard.option1ElevatorPitch()); //invokes option1ElevatorPitch() method of Project.java -- Print the elevator pitch for webFunConceptsQuilt
    }
}

// NOTE:
//This file is the Executable (Worker Bee); run this file