class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        visited = set()
        for c in sentence:
            visited.add(c)
        return len(visited) == 26

s = Solution()
print(s.checkIfPangram("leetcode"))