function mutation(arr) {
  var isMutation = true;
  var str = arr[0].toLowerCase();
  var str2 = arr[1].toLowerCase();
  
  for(var i = 0; i<str2.length; i++){
    if(!str.includes(str2[i])){
      isMutation = false;
    }
  }
  
  return isMutation;
}

mutation(["hello", "hey"]);