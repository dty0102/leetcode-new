1. hashset: build a hashset using the int in first array, then build another hashset to add those intersection integer(using hashset avoids adding duplicates)
   https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null){
            return null;
        }
        HashSet<Integer> hash = new HashSet<Integer>();
        for (int i = 0; i < nums1.length; i++){
            hash.add(nums1[i]);
        }
        HashSet<Integer> resulthash = new HashSet<Integer>();
        for(int j = 0; j < nums2.length; j++){
            if(hash.contains(nums2[j])){
                resulthash.add(nums2[j]);
            }
        }
        int size = resulthash.size();
        int[] result = new int[size];
        int index = 0;
        for (Integer num : resulthash) {
            result[index++] = num;
        }
        return result;
    }
}
2. sort + binary search : sort the first array and do binary search for every element in second array
! can set int to null, because it's primitive type
In this case, object is just a pointer to an Integer object whose value happens to be 3. That is, at the memory position where the variable object is stored, all you have is a reference to where the data really is. The memory position where number is stored, on the other hand, contains the value 3 directly.
So, you could set the object to null, but that would just mean that the data of that object is in null (that is, not assigned). You cannot set an int to null, because the language would interpret that as being the value 0.

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null){
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums1);
        for(int i = 0; i < nums2.length; i++){
            if(set.contains(nums2[i])){
                continue;
            }
            else if (binarysearch(nums1,nums2[i])){
                set.add(nums2[i]);
            }
        }
        int size = set.size();
        int[] result = new int[size];
        int index = 0;
        for (Integer num : set){
            result[index] = num;
            index++;
        }
        return result;
    }
    public boolean binarysearch(int[] nums1, int target){
        if(nums1 == null || nums1.length == 0){
            return false;
        }
        int start = 0;
        int end = nums1.length - 1;
        while(start + 1< end){
            int middle = (end - start)/2 + start;
            if (nums1[middle] < target){
                start = middle;
            }
            else if (nums1[middle] > target){
                end = middle;
            }
            else {
                return true;
            }
        }
        if (nums1[start] == target) {
            return true;
        }
        if (nums1[end] == target) {
            return true;
        }
        return false;
    }
}

3. sort & merge: sort two arrays and use pointer to compare every elements in both arrays, if they have intersection, add it to result, if they are not, move the two pointers according to the order
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1 == null || nums2 == null){
            return null;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        HashSet<Integer> hash = new HashSet<Integer>();
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] == nums2[j]){
                hash.add(nums1[i]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        int size = hash.size();
        int index = 0;
        int[] result = new int[size];
        for (Integer num : hash){
            result[index] = num;
            index++;
        }
        return result;
    }
}
