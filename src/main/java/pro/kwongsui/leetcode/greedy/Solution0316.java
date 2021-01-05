package pro.kwongsui.leetcode.greedy;

public class Solution0316 {

    public String removeDuplicateLetters(String s) {
        int[] counter = new int[26];
        for (char ch : s.toCharArray()) {
            counter[ch - 'a']++;
        }
        boolean[] gotten = new boolean[26];
        StringBuilder builder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (!gotten[ch - 'a']) {
                while (builder.length() != 0
                    && ch < builder.charAt(builder.length() - 1)
                    && counter[builder.charAt(builder.length() - 1) - 'a'] > 0) {
                    gotten[builder.charAt(builder.length() - 1) - 'a'] = false;
                    builder.deleteCharAt(builder.length() - 1);
                }
                builder.append(ch);
                gotten[ch - 'a'] = true;
            }
            counter[ch - 'a']--;
        }
        return builder.toString();
    }
}
