

/*Create a StringManipulator class that implements the following methods:*/


public class StringManipulator{
	

    //***********String trimAndConcat(String, String)************/
    //Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class*/
    
        public String trimAndConcat(String hello1, String world1){
            hello1.trim(); //trim removes all white space
            world1.trim();
    
            //remove all white space and concatenate the strings
            //Output:  HelloWorld
            return hello1.trim().concat(world1.trim()); 
        }
    
    //***********Integer getIndexOrNull(String, char) ************/
    //Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.
    
    
        public String getIndexOrNull(String str, char o) {
            int indexPos = str.indexOf(o);  //need int because it will return a number; get the index position of 'o'(char) in the string (str)
            if(indexPos == -1){ //-1 because index positions begin with 0
                return null;
            } 
            else {
                return Integer.toString(indexPos); 
                /*  Got the following error without String.valueOf() or Integer.toString() --> https://www.javatpoint.com/java-int-to-string#:~:text=Java%20Convert%20int%20to%20String%20We%20can%20convert,use%20String.format%20%28%29%20method%2C%20string%20concatenation%20operator%20etc.
                .\StringManipulator.java:27: error: incompatible types: int cannot be converted to String
                return indexPos;
                ^
                1 error*/ 
            }
        }
    
    
    
    
    //***********Integer getIndexOrNull(String, String) ************/
    //Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.
    
        public String getIndexOrNull(String hello2, String world2){
            int indexPos2 = hello2.indexOf(world2); //need int because indexPos2 is a number; word1 = "Hello", word2 = "llo" (subString)
            if(indexPos2 == -1){
                return null;
            } 
            else {
                return String.valueOf(indexPos2);
                /*  Got the following error without String.valueOf() or Integer.toString() --> https://www.javatpoint.com/java-int-to-string#:~:text=Java%20Convert%20int%20to%20String%20We%20can%20convert,use%20String.format%20%28%29%20method%2C%20string%20concatenation%20operator%20etc.
                .\StringManipulator.java:27: error: incompatible types: int cannot be converted to String
                return indexPos;
                ^
                1 error*/ 
            }
        }
    
    //***********String concatSubstring(String, int, int, String)************/
    //Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.
    
        public String concatSubstring(String hello3, int number1, int number2, String world3){
            //create a new string begin at index position 1 and end at index position 2 --> 
            //this will only grab the letter "e" from the word "Hello" 
            String newString = hello3.substring(number1, number2);
            //concatenate the letter "e" with the word "world"
            return newString.concat(world3);
    
            //https://www.javatpoint.com/substring#:~:text=Substring%20in%20Java.%20A%20part%20of%20string%20is,substring%20startIndex%20is%20inclusive%20and%20endIndex%20is%20exclusive.
        }
    }


    /*String Manipulation
You've been asked to implement a series of string manipulation methods. To do these, you will need to utilize built in string methods. Use the StringManipulator and StringManipulatorTesting classes. Below are the method signatures and a short description of the method to be implemented.

Objectives:
- Practice method signatures by implementing the tasks below.

- Implement some of the most used string methods.

Tasks:
Create a StringManipulator class that implements the following methods:

- String trimAndConcat(String, String): Trim both input strings and then concatenate them. Return the new string. Feel free to use the trim method of the String class.

StringManipulator manipulator = new StringManipulator();
String str = manipulator.trimAndConcat("    Hello     ","     World    ");
System.out.println(str); // HelloWorld 
- Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. Feel free to use the indexOf method of the String class.

StringManipulator manipulator = new StringManipulator();
char letter = 'o';
Integer a = manipulator.getIndexOrNull("Coding", letter);
Integer b = manipulator.getIndexOrNull("Hello World", letter);
Integer c = manipulator.getIndexOrNull("Hi", letter);
System.out.println(a); // 1
System.out.println(b); // 4
System.out.println(c); // null
- Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. Feel free to use the indexOf method of the String class.

StringManipulator manipulator = new StringManipulator();
String word = "Hello";
String subString = "llo";
String notSubString = "world";
Integer a = manipulator.getIndexOrNull(word, subString);
Integer b = manipulator.getIndexOrNull(word, notSubString);
System.out.println(a); // 2
System.out.println(b); // null
- String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. Feel free to use the substring method of the String class.

StringManipulator manipulator = new StringManipulator();
String word = manipulator.concatSubstring("Hello", 1, 2, "world");
System.out.println(word); // eworld*/