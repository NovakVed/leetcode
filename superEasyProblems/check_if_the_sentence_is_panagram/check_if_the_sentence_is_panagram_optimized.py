class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        visited = set(sentence)
        return len(set(sentence)) == 26

s = Solution()
print(s.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"))