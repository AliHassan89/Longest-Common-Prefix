# Longest-Common-Prefix
Write a function to find the longest common prefix string amongst an array of strings.


 e.g: {"Leet", "LeetCode", "Leeters", "Leeds"}
 should return "Lee"
 
# Solution:

1. An array of strings is received as function parameter.

2. In order to look for longest common prefix we can store the first string from array in a temporary String variable call it str1

3. Then  we loop over the str1 taking each character and comparing it with other strings. In order to compare we can use xor operator
if (str.length() > i && (str1.charAt(i) ^ str.charAt(i)) == 0)

4. As soon as an uncommon char is found we break from the main loop and return the common string.
