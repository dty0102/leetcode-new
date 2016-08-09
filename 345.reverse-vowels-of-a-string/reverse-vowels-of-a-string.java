public class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();
        int start = 0;
        int end = array.length -1;
        while (start < end){
            if(!checkvowels(array[start]) && !checkvowels(array[end])){
                start++;
                end--;
            }
            else if(!checkvowels(array[start])){
                start++;
            }
            else if(!checkvowels(array[end])){
                end--;
            }
            else {
                char temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return new String(array);
        
        
    }
    
    public boolean checkvowels(Character c){
        if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c== 'u' || c =='A' ||c == 'E' || c=='I' || c == 'O' || c == 'U'){
            return true;
        }
        return false;
    }
}
