package pro.kwongsui.offer;

public class Solution17 {

    public String printNumbers(int n) {
        StringBuilder builder = new StringBuilder();
        char[] num = new char[n];
        dfs(0, n, num, builder);
        return builder.deleteCharAt(builder.length() - 1).toString();
    }

    private void dfs(int idx, int n, char[] num, StringBuilder builder) {
        if (idx == n) {
            String s = String.valueOf(num).replaceFirst("^0*", "");
            if (s.length() != 0) {
                builder.append(s).append(",");
            }
            return;
        }
        for (char ch = '0'; ch <= '9'; ch++) {
            num[idx] = ch;
            dfs(idx + 1, n, num, builder);
        }
    }
}
