
## 1: Check if Strings Are Rotations of Each Other
<p> 
Given two strings s1 and s2 of equal length, determine whether s2 is a rotation of s1.
A string is said to be a rotation of another if it can be obtained by shifting some 
leading characters of the original string to its end without changing the order of characters.
</p>

```
Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.

Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.

Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.

```

## 2: Check if given String is Pangram or not
<p> 
  Given a string s, check if it is Pangram or not. 
A pangram is a sentence containing all letters of the English Alphabet.
Examples: 
</p>

```
Input: s = "The quick brown fox jumps over the lazy dog" 
Output: true
Explanation: The input string contains all characters from 'a' to 'z'.

Input: s = "The quick brown fox jumps over the dog"
Output: false
Explanation: The input string does not contain all characters from 'a' to 'z', as 'l', 'z', 'y' are missing

```

## 3: Add two binary strings

<p>
Given two binary strings s1 and s2, the task is to return their sum.The input strings may contain leading zeros but the output string should not have any leading zeros.
Example: 
</p>

```
Input: s1 = "1101", s2 = "111" 
Output: "10100"  
Explanation:

Add-two-binary-strings-using-Bit-by-Bit-addition
Input: s1 = "00100", s2 = "010" 
Output: "110"  
```
<img width="469" height="417" alt="image" src="https://github.com/user-attachments/assets/03049778-23c3-4680-868c-6cfab95f77e1" />



## 4: Rotate Array
<p> Given an integer array nums, rotate the array to the right by k steps, where k is non-negative </p>

```
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 
```

## 5: Contains Duplicate
<p>
  Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
</p>

```
Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true
```

## 6: Move Zeroes
<p> Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array. </p>

```
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 
```

## 7: Missing Number
<p>Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.</p>

```
Example 1:

Input: nums = [3,0,1]

Output: 2

Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:

Input: nums = [0,1]

Output: 2

Explanation:

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:

Input: nums = [9,6,4,2,3,5,7,0,1]

Output: 8

Explanation:

n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
```





