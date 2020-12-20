package pro.kwongsui.leetcode.tree;

public class Solution0779 {

    public int kthGrammar(int N, int K) {
        if (N == 1) {
            return 0;
        }
        int parent = kthGrammar(N - 1, (K + 1) / 2);
        return K % 2 == 0 ? (parent == 0 ? 1 : 0) : (parent == 0 ? 0 : 1);
    }
}
