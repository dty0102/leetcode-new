1. attach char from the end of the string to create reverse string --- time limit exceeded 
var reverseString = function(s) {
    array = s.split();
    start = 0;
    end = array.length - 1;
    while(start < end){
        temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        start++;
        end--;
    }
    return array.join();
};

2. convert string to a char array, create two points to start and end, exchange the char, convert it back to string as result
public class Solution {
    public String reverseString(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start<end){
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return new String(array);
    }
}
