1. Set: use set and intersection methods
class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        if len(nums1) ==0 or len(nums2) == 0:
            return []
        return list(set(nums1).intersection(nums2))
