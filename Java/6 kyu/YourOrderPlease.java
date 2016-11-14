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