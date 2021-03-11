package pro.kwongsui.offer;

public class Solution12 {

    public boolean exist(char[][] board, String word) {
        int h = board.length, v = board[0].length;
        char[] chars = word.toCharArray();
        boolean[][] visited = new boolean[h][v];
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < v; j++) {
                if(backtrack(board, chars, visited, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtrack(char[][] board, char[] chars, boolean[][] visited, int i, int j, int k) {
        if(k == chars.length)
            return true;
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length)
            return false;
        if(visited[i][j] || board[i][j] != chars[k])
            return false;
        visited[i][j] = true;
        boolean match = backtrack(board, chars, visited, i - 1, j, k + 1)
            || backtrack(board, chars, visited, i + 1, j, k + 1)
            || backtrack(board, chars, visited, i, j - 1, k + 1)
            || backtrack(board, chars, visited, i, j + 1, k + 1);
        if(match)
            return true;
        visited[i][j] = false;
        return false;
    }
}
