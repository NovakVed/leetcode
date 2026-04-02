# 1832. Check if the Sentence Is Pangram
# https://leetcode.com/problems/check-if-the-sentence-is-pangram?envType=problem-list-v2&envId=prshgx6i
class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        visited = set(sentence)
        return len(set(sentence)) == 26

s = Solution()
print(s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))