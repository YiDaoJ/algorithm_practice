/**
* Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.*
* Example:
*	Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"
* The returned format must be correct in order to complete this challenge. 
* Don't forget the space after the closing parenthese!
*/

public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String numberToString = "";
    for(int i=0; i<numbers.length;i++){
      numberToString += String.valueOf(numbers[i]);
    }
    String phonenumber = "(" + numberToString.substring(0,3) + ") " + numberToString.substring(3,6) + "-" + numberToString.substring(6,10);
    return phonenumber;
  }
}
