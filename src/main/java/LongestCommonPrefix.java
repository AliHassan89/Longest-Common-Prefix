/**

 Longest Common Prefix:
 Write a function to find the longest common prefix string amongst an array of strings

 e.g: {"Leet", "LeetCode", "Leeters", "Leeds"}
 should return "Lee"

 */

package main.java;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs){
    if (strs.length < 1)
      return "";

    String str1 = strs[0];
    String common = "";
    boolean unCommonFound = false;
    for (int i=0; i<str1.length(); i++)
    {
      for (String str : strs){
        if (str.length() > i && (str1.charAt(i) ^ str.charAt(i)) == 0){
            continue;
          }
        else{
          unCommonFound = true;
          break;
        }

      }
      if (unCommonFound)
      {
        break;
      }

      common += str1.charAt(i);
    }

    return common;
  }
}
