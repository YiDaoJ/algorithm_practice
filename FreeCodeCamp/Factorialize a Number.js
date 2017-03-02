function factorialize(num) {
  var fact = 1;
  for(var i = num; i>0; i--){
    fact *= i;
  }
  return fact;
}

factorialize(5);