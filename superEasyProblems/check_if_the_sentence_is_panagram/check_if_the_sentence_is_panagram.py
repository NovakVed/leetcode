# 1832. Check if the Sentence Is Pangram
# https://leetcode.com/problems/check-if-the-sentence-is-pangram?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        visited = set()
        for c in sentence:
            visited.add(c)
        return len(visited) == 26

s = Solution()
print(s.checkIfPangram("leetcode"))