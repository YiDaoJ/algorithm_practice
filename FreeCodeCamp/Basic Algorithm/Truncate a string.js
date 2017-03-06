function truncateString(str, num) {
  var newStr = "";
  if(num>=str.length){
    newStr = str;
  }else if(str.length < num+3) {
     newStr = str.substring(0,1)+ "...";
  }else if(num<3){
      newStr = str.substring(0, num) + "...";
  }else {
    newStr = str.slice(0, num-3) + "...";
  }

  return newStr;
}

truncateString("Absolutely Longer", 2);