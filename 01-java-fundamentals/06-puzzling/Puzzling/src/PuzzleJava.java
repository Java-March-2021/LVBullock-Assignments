import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    
    public ArrayList<Integer> totalOfValues(){
    	
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Puzzling Assignment - March 12, 2021 \n");

        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 1****************************************************************************************************************************************" + RESET);

        //Print the sum of all numbers in the array.
        ArrayList<Integer> valuesArray = new ArrayList<Integer>(Arrays.asList(3, 5, 1, 2, 7, 9, 8, 13, 25, 32));
        System.out.println("The values in the array are: " + CYAN_BOLD_BRIGHT + valuesArray + RESET);
        int sum = 0;
        for(int a = 0; a < valuesArray.size(); a++){   //size() in place of .length
            sum += valuesArray.get(a);
        }
        System.out.println("The sum of all of the values is: " + CYAN_BOLD_BRIGHT + sum + RESET);

        //Have the function to return an NEW array that only includes numbers that are greater than 10
        ArrayList<Integer> greaterThanTen = new ArrayList<Integer>();
        for (int b = 0; b < valuesArray.size(); b++){
            if (valuesArray.get(b) > 10){
                greaterThanTen.add(valuesArray.get(b));
            }
        }
        System.out.println("The NEW array with values > 10 is: ");
        return greaterThanTen; //NEW array with values from initial array that are > 10
    }

    public ArrayList<String> stringArray(){
        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 2****************************************************************************************************************************************" + RESET);
        //Create an array with the following values: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa
        ArrayList<String> namesArray = new ArrayList<String>(Arrays.asList("Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"));
        System.out.println("The names in this array are: " + CYAN_BOLD_BRIGHT + namesArray + RESET);

        ArrayList<String> longerThan5Letters = new ArrayList<String>();
        //Shuffle the array and print the name of each person. 
        Collections.shuffle(namesArray);
        System.out.println("Names shuffled:  " + CYAN_BOLD_BRIGHT + namesArray + RESET);

        //Have the method also return an array with names that are longer than 5 characters.
        for (int c = 0; c < namesArray.size(); c++){
            if (namesArray.get(c).length() > 5){
                longerThan5Letters.add(namesArray.get(c));
            }
        }
        System.out.println("Names that have more than 5 characters are: ");
        return longerThan5Letters; //NEW array with names that are longer than 5 characters
    }

    public void alphabetArray(){
        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 3****************************************************************************************************************************************" + RESET);
        //Create an array that contains all 26 letters of the alphabet (this array must have 26 values).
        ArrayList<Character> alphabet = new ArrayList<Character>();
            for(char ch = 'a'; ch <= 'z'; ch++){ //start with a, as long as < or equal to z, increment the character
                alphabet.add(ch); //add letter to the alphabet array
            }
            System.out.println("Letters of the Alphabet: " + CYAN_BOLD_BRIGHT + alphabet + RESET);

        // Shuffle the array and, after shuffling, display the last letter from the array. 
        Collections.shuffle(alphabet);  //shuffles the letters, no particular order
        System.out.println("SHUFFLED Alphabet:  " + CYAN_BOLD_BRIGHT + alphabet + RESET);
        //Display the last letter from the array.
        System.out.println("Last Letter of the SHUFFLED Alphabet: " + CYAN_BOLD_BRIGHT + alphabet.get(alphabet.size() - 1) + RESET);
        //Have it also display the first letter of the array.
        System.out.println("1st Letter of the SHUFFLED Alphabet:  " + CYAN_BOLD_BRIGHT + alphabet.get(0) + RESET);

        // If the first letter in the array is a vowel, have it display a message.
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));  
        /*Note for Character list enclosed in single quote or will return error: 
        .\PuzzleJava.java:70: error: no suitable constructor found for ArrayList(List<String>)
        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList("a", "e", "i", "o", "u"));*/
            for(int d = 0; d < vowels.size(); d++){ //looks like you have to use .size(), opposed to .length(), when using .asList
                if(alphabet.get(0) == vowels.get(d)){  //checks to see if the first index of the alphabet array is = to any letter in the vowels array
                    System.out.println("The first character is a vowel.-->  " + CYAN_BOLD_BRIGHT + alphabet.get(0) + RESET); //get the first character
            }
        }
    }

  //Generate and return an array with 10 random numbers between 55-100.
    //To get a random integer, you can use the nextInt method of the Random class.
    public void randomNumsInRange(){
        ArrayList<Integer> randNumsInRange = new ArrayList<Integer>();

        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 4****************************************************************************************************************************************" + RESET);
        Random r1 = new Random();
        int min = 55;
        int max = 100;
        int generateRandomNums = r1.nextInt(max - min) + min; //**See note below
            for(int e = 0; e < 10; e++){
                generateRandomNums = r1.nextInt(max - min) + min; 
                randNumsInRange.add(generateRandomNums);//adding integer values to the empty ArrayList (line 83)
        }
        System.out.println("10 Random Numbers between 55 and 100: " + CYAN_BOLD_BRIGHT + randNumsInRange + RESET);
        // System.out.println(randNumsInRange);
    }

    public ArrayList<Integer> generateSortedRandomNumsInRange(){
    //Generate and return an array with 10 random numbers between 55-100 and have it be sorted (showing the smallest number in the beginning). Display all the numbers in the array.

        ArrayList<Integer> sortedRandNums = new ArrayList<Integer>();
        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 5****************************************************************************************************************************************" + RESET);
        Random r2 = new Random();
        int lowest = 55;
        int highest = 100;
        //To get a random integer, you can use the nextInt method of the Random class.
        int generateSortedRandomNums;

        for(int e = 0; e < 10; e++){ //loops 10 times
            generateSortedRandomNums = r2.nextInt(highest - lowest) + lowest;
            sortedRandNums.add(generateSortedRandomNums); //adding integer values to the empty ArrayList (line 101)
        }
        //sort (showing the smallest number in the beginning)
        Collections.sort(sortedRandNums);
        return sortedRandNums;
    }

    // //Create a random string that is 5 characters long.
    public void randomString(){
        ArrayList<Character> randCharacter = new ArrayList<Character>();
        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 6****************************************************************************************************************************************" + RESET);
        //creating an array with lowercase letters of the alphabet
        for (char ch2 = 'a'; ch2 <= 'z'; ch2++){  // reference alphabetArray above - Task 3
            randCharacter.add(ch2);  //add letter to the randCharacter; which is actually, the alphabet
        }
        // System.out.println("Lowercase letters of the alphabet: " + randCharacter);
        String newString = ""; //empty string
        for (int f = 0; f < 5; f++){ //loops 5 times
            Random r3 = new Random();
            newString += randCharacter.get(r3.nextInt(randCharacter.size()));
        }
        System.out.println("5-character lowercase Random string from the letters of the alphabet: [" + CYAN_BOLD_BRIGHT + newString + RESET + "]");
    }

    // //Generate an array with 10 random strings that are each 5 characters long
    public void tenRandomStrings(){
        ArrayList<Character> anotherRandCharacter = new ArrayList<Character>();
        System.out.println(CYAN_BOLD_BRIGHT + "\nTask 7****************************************************************************************************************************************" + RESET);

        //creating an array with lowercase letters of the alphabet
        for (char ch3 = 'a'; ch3 <= 'z'; ch3++){
            anotherRandCharacter.add(ch3);
        }
        // System.out.println("Lowercase letters of the alphabet: " + anotherRandCharacter);
        ArrayList<String> generateString = new ArrayList<String>();
        for (int g = 0; g < 10; g++){  //loops 10 times - setting up to create 10 random strings 
            String anotherNewString = "";
            for (int h = 0; h < 5; h++){ //loops 5 times - setting up to make 5 letter string
                Random r4 = new Random();
                anotherNewString += anotherRandCharacter.get(r4.nextInt(anotherRandCharacter.size()));
            } 
            generateString.add(anotherNewString);
        }
        System.out.println("10 lowercase Random strings, each having 5 letters: " + CYAN_BOLD_BRIGHT + generateString + RESET);
    }
}


/*
NOTE: if you put a return in this file, then put the System.out.println in the ...Controller file

** Resource:  
https://mkyong.com/java/java-generate-random-integers-in-a-range/

What is (max – min) + 1) + min?

Above formula will generate a random integer in a range between min (inclusive) and max (inclusive).*/