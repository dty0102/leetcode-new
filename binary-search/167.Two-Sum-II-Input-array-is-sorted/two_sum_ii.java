1. move the pointer for one step each time
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0){
            return null;
        }
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];
        while(start < end){
            if(numbers[start] + numbers[end] == target){
                result[0] = start + 1;
                result[1] = end + 1;
            }
            if(numbers[start] + numbers[end] > target){
                end--;
            }
            else {
                start++;
            }
        }
        return result;
    }
}
