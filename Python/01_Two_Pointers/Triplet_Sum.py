'''
Given an array of integers, return all triplets [a, b, c] such that a + b + c = 0 . The solution must not contain duplicate triplets (e.g., [1, 2, 3] and [2, 3, 1] are considered duplicates). If no such triplets are found, return an empty array.

Each triplet can be arranged in any order, and the output can be returned in any order.

Example:
Input: nums = [0, -1, 2, -3, 1]
Output: [[-3, 1, 2], [-1, 0, 1]]
'''

from typing import List

# Brute Force solution -> O(n^3) because of 3 nested loops
def tripletSum_bruteForce(nums : List[int]) -> List[int]:
    n = len(nums)
    triplets = set()   # A Hash set to add unique sets only
    for i in range(n):
        for j in range(i+1, n):
            for k in range(j+1, n):
                if nums[i] + nums[j] + nums[k] == 0:
                    triplet = tuple(sorted([nums[i],nums[j],nums[k]]))
                    triplets.add(triplet)
    return [list(triplet) for triplet in triplets] # List comprehension to transform the collection of triplets into the list of lists

# Two pointer solution
def triplet_Sum(nums: List[int])->List[List[int]]:
    triplets = []
    nums.sort()
    for i in range(len(nums)):
        if nums[i] > 0:
            break
        if i > 0 and nums[i] == nums[i-1]:
            continue
        
        # Finding pair
        pairs = pair_sum_sorted_all_pairs(nums,i+1,-nums[i])
        for pair in pairs:
            triplets.append([nums[i]] + pair)
    return triplets

# function to find the pair
def pair_sum_sorted_all_pairs(nums: List[int], start: int, target:int) -> List[int]:
    pairs = []
    left, right = start, len(nums)-1
    while left < right:
        sum = nums[left]+nums[right]
        if sum == target:
            pairs.append([nums[left],nums[right]])
            left += 1
            while left < right and nums[left] == nums[left-1]:
                left += 1
        elif sum < target:
            left += 1
        else:
            right -= 1
    return pairs

# user input
nums_input = input("Enter the numbers seperated by space:")
nums = list(map(int, nums_input.split()))

# Call the function
result = triplet_Sum(nums)

print(result)