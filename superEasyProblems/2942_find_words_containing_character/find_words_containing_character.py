# 2942. Find Words Containing Character
# https://leetcode.com/problems/find-words-containing-character/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def findWordsContaining(self, words: List[str], x: str) -> List[int]:
        res=[]
        for i in range(len(words)):
            if x in words[i]:
                res.append(i)
        return res