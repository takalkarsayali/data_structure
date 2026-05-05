'''
Given an array of integers sorted in ascending order and a target value, return the indexes of any pair of numbers in the array that sum to the target. The order of the indexes in the result doesn't matter. If no pair is found, return an empty array.

Example 1:
Input: nums = [-5, -2, 3, 4, 6], target = 7
Output: [2, 3]
Explanation: nums[2] + nums[3] = 3 + 4 = 7

Example 2:
Input: nums = [1, 1, 1], target = 2
Output: [0, 1]
Explanation: other valid outputs could be [1, 0], [0, 2], [2, 0], [1, 2] or [2, 1].

'''

# Brute Force Solution - O(n^2)
from typing import List

def pairSum_BruteForce(nums: List[int], target:int)->List[int]:
    n = len(nums)
    for i in range(n):
        for j in range(i+1,n):
            if nums[i] + nums[j] == target:
                return [i,j]
    return []

def pairSum_sorted(nums: List[int], target:int)->List[int]:
    left , right = 0, len(nums)-1
    while(left < right):
        sum = nums[left] + nums[right]
        if sum < target:
            left += 1
        elif sum > target:
            right -= 1
        else:
            return [left,right]
    return[]


# ---- User Input ----
nums_input = input("Enter numbers separated by space: ")
nums = list(map(int, nums_input.split()))

target = int(input("Enter target value: "))

# ---- Function Call ----
# result = pairSum_BruteForce(nums, target)
result = pairSum_sorted(nums, target)

# ---- Output ----
if result:
    print(f"Pair found at indices: {result}")
else:
    print("No pair found")