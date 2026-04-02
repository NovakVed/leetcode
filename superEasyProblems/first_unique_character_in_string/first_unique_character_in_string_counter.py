# 387. First Unique Character in a String
# https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=prshgx6i
from collections import Counter


class Solution:
    def firstUniqChar(self, s: str) -> int:
        count = Counter(s)
        for i, char in enumerate(s):
            if count[char] == 1:
                return i
        return -1


s = Solution()
print(s.firstUniqChar('leetcode'))