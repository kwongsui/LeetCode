package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0652 {

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Map<String, Integer> serialToId = new HashMap<>();
        Map<Integer, Integer> idToCnt = new HashMap<>();
        int[] uid = new int[]{1};
        serialize(root, list, serialToId, idToCnt, uid, new StringBuilder());
        return list;
    }

    private int serialize(TreeNode node, List<TreeNode> list,
        Map<String, Integer> serialToId, Map<Integer, Integer> idToCnt,
        int[] uid, StringBuilder builder) {
        if (node == null) {
            return 0;
        }
        int l = serialize(node.left, list, serialToId, idToCnt, uid, builder);
        int r = serialize(node.right, list, serialToId, idToCnt, uid, builder);
        String serial = builder.append(l).append(",").append(r).append(",")
            .append(node.val).toString();
        int id = serialToId.computeIfAbsent(serial, k -> uid[0]++);
        idToCnt.put(id, idToCnt.getOrDefault(id, 0) + 1);
        if (idToCnt.get(id) == 2) {
            list.add(node);
        }
        builder.delete(0, builder.length());
        return id;
    }

    public List<TreeNode> findDuplicateSubtrees1(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Map<String, Integer> serialToCnt = new HashMap<>();
        serialize1(root, list, serialToCnt, new StringBuilder());
        return list;
    }

    private String serialize1(TreeNode node, List<TreeNode> list,
        Map<String, Integer> serialToCnt, StringBuilder builder) {
        if (node == null) {
            return "#";
        }
        String l = serialize1(node.left, list, serialToCnt, builder);
        String r = serialize1(node.right, list, serialToCnt, builder);
        String serial = builder.append(l).append(",").append(r).append(",")
            .append(node.val).toString();
        serialToCnt.put(serial, serialToCnt.getOrDefault(serial, 0) + 1);
        if (serialToCnt.get(serial) == 2) {
            list.add(node);
        }
        builder.delete(0, builder.length());
        return serial;
    }
}
