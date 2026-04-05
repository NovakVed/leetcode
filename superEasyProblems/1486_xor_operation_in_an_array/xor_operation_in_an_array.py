class Solution:
    def xorOperation(self, n: int, start: int) -> int:
        result = 0
        for k in range(n):
            result ^= start + 2 * k
        return result

s = Solution()
print(s.xorOperation(5, 0))