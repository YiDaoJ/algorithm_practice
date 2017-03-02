var arr;
function reverseString(str) {
  arr = str.split("").reverse();
  str = arr.join("");
  return str;
}

reverseString("hello");