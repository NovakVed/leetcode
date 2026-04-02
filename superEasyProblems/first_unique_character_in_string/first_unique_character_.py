# 387. First Unique Character in a String
# https://leetcode.com/problems/first-unique-character-in-a-string/description/?envType=problem-list-v2&envId=prshgx6i
from collections import defaultdict


class Solution:
    def firstUniqChar(self, s: str) -> int:
        frequency = defaultdict(int)
        for c in s:
            frequency[c] += 1
        for i, c in enumerate(s):
            if frequency[c] == 1:
                return i

        return -1

s = Solution()
print(s.firstUniqChar('leetcode'))