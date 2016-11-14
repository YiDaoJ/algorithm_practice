public class SumOfTheFirstNthTermOfSeries {	
	public static String seriesSum(int n) {
	
    if(n == 0){

      return String.valueOf(0.0);

    }else{

      double j = 1.0;
      double sum = 0.0;

      for(int i = 1; i<=n; i++){
        sum += 1.0/j;
        j = j+3.0;
      }

      return String.format("%.2f", sum);
      
    }
	}
}