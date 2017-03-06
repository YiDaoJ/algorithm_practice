function rot13(str) { // LBH QVQ VG!
  var result ="";
  for(var i = 0; i<str.length; i++){
    var num = str.charCodeAt(i);
    if(num<=77 && num>=65){
      result += String.fromCharCode(num+13);
    }else if(num <=90 && num >=78){
      result += String.fromCharCode(num-13);
    }else {
      result += str[i];
    }
  }
  return result;
}

// Change the inputs below to test
rot13("SERR PBQR PNZC");
