1. hashmap : create two hashmap for two input arrays, store the num and the time of apperance, and then try to use the smaller one to search in the bigger one, got the smaller number of apperance
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null){
            return new int[0];
        }
        HashMap<Integer,Integer> hash1 = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums1.length; i++){
            if(hash1.containsKey(nums1[i])){
                hash1.put(nums1[i],hash1.get(nums1[i]) + 1);
            }
            else {
                hash1.put(nums1[i],1);
            }
        }
        HashMap<Integer,Integer> hash2 = new HashMap<Integer,Integer>();
        for (int j = 0; j < nums2.length; j++){
            if(hash2.containsKey(nums2[j])){
                hash2.put(nums2[j],hash2.get(nums2[j]) + 1);
            }
            else {
                hash2.put(nums2[j],1);
            }
        }
        if (hash1.size() == 0 || hash2.size() == 0){
            return new int[0];
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(hash1.size() < hash2.size()){
            result = findintersection(hash1,hash2);
        }
        else {
            result = findintersection(hash2,hash1);
        }
        int size = result.size();
        int[] realresult = new int[size];
        int i = 0;
        for (Integer num : result){
            realresult[i++] = num; 
        }
        return realresult;
    }
    public ArrayList<Integer> findintersection(HashMap<Integer,Integer> small, HashMap<Integer,Integer> large){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (Integer num : small.keySet()){
            if(large.containsKey(num)){
                int time = 0;
                if(small.get(num) < large.get(num)){
                    time = small.get(num);
                }
                else {
                    time = large.get(num);
                }
                int i = 0;
                while (i < time){
                    result.add(num);
                    i++;
                }
            }
        }
        return result;
    }
}

2. Improvement of the hashmap methods
    public int[] intersection(int[] nums1, int[] nums2) {
        // Write your code here
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums1.length; ++i) {
            if (map.containsKey(nums1[i]))
                map.put(nums1[i], map.get(nums1[i]) + 1); 
            else
                map.put(nums1[i], 1);
        }

        List<Integer> results = new ArrayList<Integer>();

        for (int i = 0; i < nums2.length; ++i)
            if (map.containsKey(nums2[i]) &&
                map.get(nums2[i]) > 0) {
                results.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1); 
            }

        int result[] = new int[results.size()];
        for(int i = 0; i < results.size(); ++i)
            result[i] = results.get(i);

        return result;
    }
