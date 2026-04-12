# 2942. Find Words Containing Character
# https://leetcode.com/problems/find-words-containing-character/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List

# Time complexity: O(n * m)
# Space complexity: O(1) The space required for the return variable is not included in the calculation.
class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res=[]
        for i in range(len(words)): # this is O(n)
            if x in words[i]: # this is also O(m)
                res.append(i)
        return res