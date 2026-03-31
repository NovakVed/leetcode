class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        return max(len(sentence.split()) for sentence in sentences)

s = Solution()
print(s.mostWordsFound(["alice and bob love leetcode", "i think so too", "this is great thanks very much"]))