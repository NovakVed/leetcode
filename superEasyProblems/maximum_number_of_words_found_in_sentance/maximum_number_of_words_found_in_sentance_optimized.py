# 2114. Maximum Number of Words Found in Sentences
# https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List


class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        return max(len(sentence.split()) for sentence in sentences)

s = Solution()
print(s.mostWordsFound(["alice and bob love leetcode", "i think so too", "this is great thanks very much"]))