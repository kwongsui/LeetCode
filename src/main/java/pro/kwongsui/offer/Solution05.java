package pro.kwongsui.offer;

public class Solution05 {

    public String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(ch == ' ') {
                builder.append("%20");
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();
    }
}
