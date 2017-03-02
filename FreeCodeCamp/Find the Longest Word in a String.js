function findLongestWord(str) {
  var arr = str.split(" ");
  var max = 0;
  
  for(var i = 0; i<arr.length; i++){
    
    if(arr[i].length > max){
      max = arr[i].length;
    }
    
  }  
  return max;
}

findLongestWord("The quick brown fox jumped over the lazy dog");