function titleCase(str) {
  var arr = str.split(" ");
  var newStr = "";
  for(var i = 0; i<arr.length; i++){
    arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1).toLowerCase();
  }
  newStr = arr.join(" ");
  return newStr;
}

titleCase("I'm a little tea pot");
