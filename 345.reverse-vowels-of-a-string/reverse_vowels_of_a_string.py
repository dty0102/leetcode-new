class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowels = ['a','e','i','o','u','A','E','I','O','U']
        lists = list(s)
        start = 0
        end = len(lists) - 1
        while start < end:
            if lists[start] in vowels and lists[end] in vowels:
                temp = lists[start]
                lists[start] = lists[end]
                lists[end] = temp
                start+=1
                end-=1
            elif lists[start] in vowels and lists[end] not in vowels:
                end-=1
            elif lists[start] not in vowels and lists[end] in vowels:
                start+=1
            else:
                start+=1
                end-=1
        return ''.join(lists)
        
1. use and instead of &&
