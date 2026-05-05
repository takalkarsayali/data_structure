'''
A palindrome is a sequence of characters that reads the same forward and backward.

Given a string, determine if it's a palindrome after removing all non-alphanumeric characters. A character is alphanumeric if it's either a letter or a number.

Example 1:
Input: s = 'a dog! a panic in a pagoda.'
Output: True

Example 2:
Input: s = 'abc123'
Output: False

'''

def IsPalindrome( text:str) -> bool:
    left, right = 0, len(text)-1
    while(left < right):
        while not (text[left].isalnum()):
            left += 1
        while not (text[right].isalnum()):
            right -= 1
        if text[left] != text[right]:
            return False
        left += 1
        right -= 1
    return True

user_str = input("Enter the string to validate palindrome:- ")
print(IsPalindrome(user_str))
print("-----COMPLETED-----")

