class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        lists = list(s)
        for i in range(len(s)/2):
            temp = lists[i]
            lists[i] = lists[len(s) -1 - i]
            lists[len(s) -1 -i] = temp
        return ''.join(lists)


1. list(str): convert string to a list of char
2. ''.join(lists): join the char together with '', will actually convert it back to string
