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
