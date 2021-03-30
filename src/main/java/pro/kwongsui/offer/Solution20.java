package pro.kwongsui.offer;

public class Solution20 {

    private int index = 0;

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        s = s + "|"; // 哨兵字符

        while (s.charAt(index) == ' ') {
            index++;
        }

        boolean numeric = isInt(s);
        if (s.charAt(index) == '.') {
            index++;
            numeric = isUnsignedInt(s) || numeric; // 小数点两边有一边有数字即可
        }
        if (s.charAt(index) == 'e' || s.charAt(index) == 'E') {
            index++;
            numeric = isInt(s) && numeric; // e 或 E 两边都必须有数字
        }

        while (s.charAt(index) == ' ') {
            index++;
        }

        return numeric && s.charAt(index) == '|';
    }

    private boolean isInt(String s) {
        if (s.charAt(index) == '+' || s.charAt(index) == '-') {
            index++;
        }
        return isUnsignedInt(s);
    }

    private boolean isUnsignedInt(String s) {
        int start = index;
        while ('0' <= s.charAt(index) && s.charAt(index) <= '9') {
            index++;
        }
        return index > start;
    }
}
