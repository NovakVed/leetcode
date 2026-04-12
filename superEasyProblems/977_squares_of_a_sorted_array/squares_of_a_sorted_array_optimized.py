# 977. Squares of a Sorted Array
# https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=problem-list-v2&envId=prshgx6i
from typing import List

# Time complexity: O(n): You traverse the array once with the two pointers, and each element is processed exactly once.
# Space complexity: O(n): You create a new array (result) of the same size as the input.
class Solution:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0] * n
        left, right = 0, n - 1
        for i in range(n - 1, -1, -1):
            if abs(nums[left]) > abs(nums[right]):
                result[i] = nums[left] * nums[left]
                left += 1
            else:
                result[i] = nums[right] * nums[right]
                right -= 1
        return result

s = Solution()
print(s.sortedSquares([-4,-1,0,3,10]))