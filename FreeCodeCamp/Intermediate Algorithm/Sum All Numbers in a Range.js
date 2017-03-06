function sumAll(arr) {
  var newArr = arr.sort(function(a, b){return a>b;});
  var sum = 0;
  for(var i = newArr[0]; i <=newArr[1];i++){
    sum += i;
  }
  return sum;
}

sumAll([5, 10]);