package test.java;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

import main.java.LongestCommonPrefix;
import org.junit.Test;

public class LongestCommonPrefixTest {
  LongestCommonPrefix lcp = new LongestCommonPrefix();

  @Test
  public void longestCommonPrefix_checkForEmptyStrings(){
    //given
    String[] strs = {"", ""};

    //when
    String common = lcp.longestCommonPrefix(strs);

    //then
    assertThat(common, equalTo(""));
  }

  @Test
  public void longestCommonPrefix_checkForNonEmptyStrings(){
    //given
    String[] strs1 = {"Leet", "LeetCode", "Leeters", "Leeds"};
    String[] strs2 = {"aa", "a"};

    //when
    String common1 = lcp.longestCommonPrefix(strs1);
    String common2 = lcp.longestCommonPrefix(strs2);

    //then
    assertThat(common1, equalTo("Lee"));
    assertThat(common2, equalTo("a"));
  }
}
