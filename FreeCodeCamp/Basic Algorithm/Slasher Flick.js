function slasher(arr, howMany) {
  // it doesn't always pay to be first
  if (arr.length <= howMany) {
    arr = [];
  } else {
    arr.splice(0, howMany);
  }
  
  return arr;
}

slasher([1, 2, 3], 2);