function getIndexToIns(arr, num) {  
  
  var newArr = arr.sort(function(a, b){return a-b;});
  
  for(var i = 1; i<=newArr.length; i++){
    if(num > newArr[i-1] && num < newArr[i]){
      return i;
    }else if(num <= newArr[0]){
      return 0; 
    }else if(num > newArr[newArr.length-1]){
      return arr.length;
    }else if(num === newArr[i]){
      return i;
    }
  }
  
}

getIndexToIns([5, 3, 20, 3], 5);