/**
Description:
Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.
Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.
For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"
*/

public class YourOrderPlease {
 public static String order(String words) {

        String stringarray[]=words.split(" ");        
        String result ="";
        if(words.isEmpty() || words == null || words == ""){

            result = "";           

        }else{
            
            for(int i = 0; i<stringarray.length; i++){

                for(int j = 0; j<stringarray.length; j++){
                    if(stringarray[j].contains(String.valueOf(i+1)))
                        result += stringarray[j] + " ";
                }
            }

            result = result.substring(0, result.length()-1);            
        }
        return result;
    }
}
