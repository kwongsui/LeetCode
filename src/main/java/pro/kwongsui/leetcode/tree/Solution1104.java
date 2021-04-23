package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution1104 {

    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();
        int level = (int) (Math.log(label) / Math.log(2));
        while (label > 1) {
            list.add(0, label);
            label = (int) (Math.pow(2, level - 1) + Math.pow(2, level) - 1 - label / 2);
            level--;
        }
        list.add(0, label);
        return list;
    }
}
