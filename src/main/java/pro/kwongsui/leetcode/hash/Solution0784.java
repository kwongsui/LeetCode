package pro.kwongsui.leetcode.hash;

public class Solution0784 {

  public String shortestCompletingWord(String licensePlate, String[] words) {
    int[] countL = count(licensePlate);
    String res = "";
    for (String word : words) {
      int[] countW = count(word);
      if ((word.length() < res.length() || res.length() == 0) && isCompletingWord(countW, countL)) {
        res = word;
      }
    }
    return res;
  }

  private boolean isCompletingWord(int[] count1, int[] count2) {
    for (int i = 0; i < count1.length; i++) {
      if (count1[i] < count2[i]) {
        return false;
      }
    }
    return true;
  }

  private int[] count(String s) {
    int[] counter = new int['z' - 'a' + 1];
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLetter(ch)) {
        ch = Character.toLowerCase(ch);
        counter[ch - 'a']++;
      }
    }
    return counter;
  }
}
