1.
var reverseString = function(s) {
    var array = s.split("");
    var start = 0;
    var end = array.length - 1;
    while(start < end){
        var temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
    return array.join("");
};
2.
var reverseString = function(s) {
    return s.split("").reverse().join("");
};
3.
var reverseString = function(s) {
    var i = 0, len = s.length, s1 = "";
    for (i = 0; i < len; ++i) {
        s1 += s.charAt(len - (i + 1));
        }
    return s1;
};

1) string.split(separator,limit): 
    separator: Optional. Specifies the character, or the regular expression, to use for splitting the string. If omitted, the entire string will be returned (an array with only one item)
    limit	: Optional. An integer that specifies the number of splits, items after the split limit will not be included in the array
2) array.reverse(): reverse the order of an array
3) array.join(separator): 
    separator:Optional. The separator to be used. If omitted, the elements are separated with a comma

