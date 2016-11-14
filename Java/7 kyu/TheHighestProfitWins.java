class TheHighestProfitWins {
    public static int[] minMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 0; i<arr.length;i++){
        
          if(max < arr[i])
              max = arr[i];
        }
        
        for( int j = 0; j < arr.length; j++){
          if(min > arr[j])
            min = arr[j];
        
        }
        
        int[] arr2 = {min, max};
        
        return arr2;
    }
}