import java.util.Arrays;
import java.util.ArrayList;

public class Basic13Java{

    public static final String RESET = "\033[0m";  // Text Reset
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN

    public static void main(String[] args){
    	
        System.out.println("\nLaura Bullock - March 2021 Java Cohort - Basics Assignment - March 12, 2021 \n");

        int[] numbers = new int[255];
        for(int num = 0; num < numbers.length; num++){
            numbers[num] = num + 1;
        }
        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Print 1-255*************\n" + RESET);
        System.out.println(Arrays.toString(numbers) + "\n");

        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Print odd numbers between 1-255*************\n" + RESET);
        int[] numbers2 = new int[256];
        for(int a = 1; a < numbers2.length; a++){
            if(a % 2 != 0){
                System.out.print(a + " ");
            }
        }

        System.out.println(CYAN_BOLD_BRIGHT + "\n\n***********Print Sum*************\n" + RESET);
        int[] printSum = new int[256];
        int sum = 0;

        for(int i = 0; i < printSum.length; i++){
            System.out.print("New number: " + i + "    ");
            sum = i + sum;
            System.out.println("Sum: " +CYAN_BOLD_BRIGHT + sum + RESET);
        }

        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Iterating through an array*************\n" + RESET);
        ArrayList<Integer> iterateArray = new ArrayList<Integer>();
        iterateArray.add(1);
        iterateArray.add(3);
        iterateArray.add(5);
        iterateArray.add(7);
        iterateArray.add(9);
        iterateArray.add(13);

        System.out.println("The values added to the array are:  ");
        for (int x : iterateArray){
            System.out.print(CYAN_BOLD_BRIGHT + x + " " + RESET);
        }


        System.out.println(CYAN_BOLD_BRIGHT + "\n\n***********Find Max*************\n" + RESET);
        int findMaxArray[] = {89, -32, -2, -234, 0, 28};
        Arrays.sort(findMaxArray);

        System.out.println("Maximum value in the array is = " + CYAN_BOLD_BRIGHT + findMaxArray[findMaxArray.length - 1] + RESET);		


        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Get Average*************\n" + RESET);
        double averageArray[] = {120, 75.82, 245, 6};
        double total = 0.0;

        for (double nmbr : averageArray) {
            total += nmbr;
        }

        double average = total / averageArray.length;
        System.out.println("The average of the array values is:  " + CYAN_BOLD_BRIGHT + average + RESET);


        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Array with Odd Numbers*************\n" + RESET);

        ArrayList<Integer> oddNumbersArray = new ArrayList<Integer>();
        for(int o = 0; o <= 255; o++){
            if(o % 2 != 0){
                oddNumbersArray.add(o);
                System.out.print(o + " ");
            }
        }            
        // return oddNumbersArray;

        System.out.println(CYAN_BOLD_BRIGHT + "\n\n***********Greater Than Y*************\n" + RESET);
        int greaterThanY[] = {1, 3, 5, 7};
        int count = 0;
        int y = 3;
		for(int num7 : greaterThanY) {
			if(num7 > y){
                count++;
            }
        }
        System.out.println("Number of values greater than Y: " + CYAN_BOLD_BRIGHT + count + RESET);


        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Square the values*************\n" + RESET);
        int squareVals[] = {1, 5, 10, -2};
        System.out.println("The square of array values are: ");
		for(int v = 0; v < squareVals.length; v++) {
            squareVals[v] = squareVals[v] * squareVals[v];
            System.out.println(CYAN_BOLD_BRIGHT + squareVals[v] + " " + RESET);
        }

        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Eliminate Negative Numbers*************\n" + RESET);

        System.out.println("Negative values were replaced with 0:");

        int negNums[] = {1, 5, -100, 10, -2, 6};

		for(int n = 0; n < negNums.length; n++) {
            if(negNums[n] < 0){
                negNums[n] = 0;
            }
            System.out.println(CYAN_BOLD_BRIGHT + negNums[n] + " " + RESET);
        }


        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Max, Min, and Average*************\n" + RESET);

        int minMaxAvg[] = {1, 5, 10, -2};

        double result = 0.0;
        for(double val8 : minMaxAvg){
            result = result + val8;
        }
        double avg = result / minMaxAvg.length;
        Arrays.sort(minMaxAvg);

        System.out.println("Minimum: " + CYAN_BOLD_BRIGHT + minMaxAvg[0] + RESET);
        System.out.println("Maximum: " + CYAN_BOLD_BRIGHT + minMaxAvg[minMaxAvg.length - 1] + RESET);
        System.out.println("Average: " + CYAN_BOLD_BRIGHT + avg + RESET);


        System.out.println(CYAN_BOLD_BRIGHT + "\n***********Shifting the Values in the Array*************\n" + RESET);
        ArrayList<Integer> shiftPosition = new ArrayList<Integer>(Arrays.asList(1, 5, 10, 7, -2));
        int done = 0;
        System.out.println("Current Array set: " + CYAN_BOLD_BRIGHT + shiftPosition + RESET);

        for (int h = 0; h <= shiftPosition.size() - 1; h++){
            if (h == shiftPosition.size() - 1){
                shiftPosition.set(h, 0);
            }
            else{
                done = shiftPosition.get(h + 1);
                shiftPosition.set(h, done);
            }
        }
        System.out.println("Array after shift: " + CYAN_BOLD_BRIGHT + shiftPosition + RESET);

    }
}