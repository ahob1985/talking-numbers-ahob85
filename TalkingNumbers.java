import java.util.Scanner;

/**
 * Write a description of class TalkingNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TalkingNumbers
{

    /**
     * Prints a simple greeting. Be as creative as you want here. Be sure to 
     * include your name as the author!
     */
    public static void printGreeting() {

    }

    /**
     * This function takes an int between 1 and 9 (inclusive) as input and 
     * returns that same value in word form. If the int is not between 1 and 
     * 9, the function returns an empty string, which is just "".
     * 
     * Examples:
     * sayOneNine(5) → "five"
     * sayOneNine(8) → "eight"
     * sayOneNine(13) → ""
     */
    public static String sayOneNine(int num) {

    }

    /**
     * This function takes an int between 10 and 19 (inclusive) as input and 
     * returns that same value in word form. If the int is not between 10 and
     * 19, the function returns an empty string, which is just "".
     * 
     * Examples:
     * sayTenNineteen(11) → "eleven"
     * sayTenNineteen(15) → "fifteeen"
     * sayTenNineteen(25) → ""
     */
    public static String sayTenNineteen(int num) {

    }

    /**
     * This function takes an int between 2 and 9 (inclusive) as input and 
     * returns that same value in word form, but in the tens place. If the int
     * is not between 2 and 9, the function returns an empty string, 
     * which is just "".
     * 
     * Examples:
     * sayTwentyNinety(5) → "fifty"
     * sayTwentyNinety(8) → "eighty"
     * sayTwentyNinety(1) → ""
     */
    public static String sayTwentyNinety(int num) {
 
    }

    /**
     * This function calls the three functions above to convert an entire 
     * int (num) into word form, then returns that word. This function should 
     * be able to handle ints from 0 to 9999 (inclusive).
     * 
     * To do this, first declare a variable named wordForm at the top of the
     * function. This will be the string you will return at the end of the 
     * function, so initialize it to an empty string at the start: 
     * 
     * String wordForm = "";
     * 
     * Your first conditional statement should check if num is equal to 0. If 
     * so, set wordForm to the string "zero".
     * 
     * Otherwise, build the word form of num by chopping num into thousands,
     * hundreds, tens, and ones. Convert each place value number to a word by 
     * calling the three functions above, and concatenate each word with the 
     * wordForm variable.
     * 
     * At the very end of your function it should simply return wordForm.
     * 
     * Examples:
     * sayNumber(0) → "zero"
     * sayNumber(9999) → "nine-thousand nine-hundred ninety-nine"
     * sayNumber(75) → "seventy-five"
     */
    public static String sayNumber(int num) {
 
    }

    /**
     * This function simply runs your program. At the very least it should 
     * greet the user, ask the user to enter an integer between 0 and 9999, 
     * then print that integer in word form.
     */
    public static void main(String[] args) {

    }
}
