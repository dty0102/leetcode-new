/**
 * @param {string} s
 * @return {string}
 */
var reverseVowels = function(s) {
    var array = s.split("");
    var start = 0;
    var end = array.length - 1;
    var vowels = "aeiouAEIOU";
    while(start < end){
        if(vowels.indexOf(array[start]) > -1 && vowels.indexOf(array[end]) > -1){
            var temp = array[start]
            array[start] = array[end]
            array[end] = temp
            start++;
            end--;
        }
        else if(vowels.indexOf(array[start]) === -1){
            start++;
        }
        else if(vowels.indexOf(array[end]) === -1){
            end--;
        }
        else{
            start++;
            end--;
        }
    }
    return array.join('');
};

1. string.indexOf(character): will search the character in the string, return a number, representing the position where the specified searchvalue occurs for the first time, or -1 if it never occurs
