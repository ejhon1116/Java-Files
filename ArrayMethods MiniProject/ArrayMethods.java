/* ArrayMethods.java || Author: Ethan Jhong *
* ----------------------------------------- *
*  A bunch of methods that can either find  *
*  the lowest or highest value of arrays or *
* return the array reversed                 */

import javax.swing.JOptionPane;

public class ArrayMethods {
    public static void main(String[] args) {
        
        //Declares loops that will be used later for user exit or empty arrays
        boolean loop = true;

        //Creates an object of buttons for my OptionDialog
        Object[] buttons1 = { "Reverse Array", "Smallest Value", "Largest Value" };

        //Loops through the program as many times as the user desires
        while (loop == true) {

            loop = false;
            boolean loop2 = true;
            //Asks for the user's input
            String strArr = JOptionPane.showInputDialog(null,
                    "Input an array of integers separated by a space (i.e. 1 2 3 4 5 6 7)", "Array Methods",
                    JOptionPane.QUESTION_MESSAGE);

            //Checks if the array is empty or null
            if (strArr == null || strArr.equals(""))
                loop2 = false;

            while (loop2 == true) {

                //Asks the user which method they want to use
                int choice = JOptionPane.showOptionDialog(null,
                        "Please choose what method you would like to use on your array", "Array Methods",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons1, null);

                //Tries and catches if the user inputted a valid array. If the array is valid it returns the desired output
                try {
                    if (choice == 0)
                        JOptionPane.showMessageDialog(null,
                                "Reverse Array: " + printArray(reverseArray(strArrToIntArr(strArr.split(" ")))),
                                "Array Methods", JOptionPane.INFORMATION_MESSAGE);
                    else if (choice == 1)
                        JOptionPane.showMessageDialog(null,
                                "Smallest Value: " + smallestValue(strArrToIntArr(strArr.split(" "))), "Array Methods",
                                JOptionPane.INFORMATION_MESSAGE);
                    else if (choice == 2)
                        JOptionPane.showMessageDialog(null,
                                "Largest Value: " + largestValue(strArrToIntArr(strArr.split(" "))), "Array Methods",
                                JOptionPane.INFORMATION_MESSAGE);

                //Tells the user if they entered an invalid array
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "You entered an invalid array!", "Array Methods",
                            JOptionPane.ERROR_MESSAGE);

                //Allows the user to quit or reuse the program
                } finally {
                    int choice2 = JOptionPane.showConfirmDialog(null,
                            "Would you like to reuse the program", "Array Methods",
                            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                    if (choice2 == 0)
                        loop = true;
                    else {
                        loop = false;
                    }
                    loop2 = false;
                }
            }
        }
    }

    public static int[] reverseArray(int[] arr) {

        //Creates an array the same size as the inputted one. Loops through the inputted array backwards adding each element to the new array
        int n = 0;
        int[] ret = new int[arr.length];
        for (int length = arr.length - 1; length >= 0; length--) {
            ret[length] = arr[n];
            n++;
        }
        return ret;
    }

    public static int smallestValue(int[] arr) {

        //Loops through the array until it finds the lowest value
        int n = arr[0];
        for (int e : arr) {
            if (e < n)
                n = e;
        }
        return n;
    }

    public static int largestValue(int[] arr) {

        //Loops through the array until it finds the highest value
        int n = arr[0];
        for (int e : arr) {
            if (e > n)
                n = e;
        }
        return n;
    }

    public static String printArray(int[] arr) {

        //Loop through the array and adds each element to a string with a space between each. Returns the string
        String ret = "";
        for (int e : arr) {
            ret = (ret + " " + e).trim();
        }
        return ret;
    }

    public static int[] strArrToIntArr(String[] arr) {

        //Takes an array of strings that are integers(["1", "2", "3"]) and turns them into an integer array([1, 2, 3])
        int[] ret = new int[arr.length];
        for (int n = 0; n < arr.length; n++) {
            ret[n] = Integer.parseInt(arr[n]);
        }
        return ret;
    }
}
