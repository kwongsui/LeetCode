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
        Map<TreeNode, String> nodeToSerial = new HashMap<>();
        Map<String, Integer> serialToCnt = new HashMap<>();
        serialize(root, list, nodeToSerial, serialToCnt, new StringBuilder());
        return list;
    }

    private void serialize(TreeNode node, List<TreeNode> list,
        Map<TreeNode, String> nodeToSerial, Map<String, Integer> serialToCnt,
        StringBuilder builder) {
        if (node == null) {
            return;
        }
        serialize(node.left, list, nodeToSerial, serialToCnt, builder);
        serialize(node.right, list, nodeToSerial, serialToCnt, builder);
        String serial = builder.append(nodeToSerial.getOrDefault(node.left, "#"))
            .append(",")
            .append(nodeToSerial.getOrDefault(node.right, "#"))
            .append(",")
            .append(node.val).toString();
        nodeToSerial.put(node, serial);
        serialToCnt.put(serial, serialToCnt.getOrDefault(serial, 0) + 1);
        if (serialToCnt.get(serial) == 2) {
            list.add(node);
        }
        builder.delete(0, builder.length());
    }

    public List<TreeNode> findDuplicateSubtrees1(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Map<String, Integer> serialToCnt = new HashMap<>();
        serialize1(root, list, serialToCnt);
        return list;
    }

    private String serialize1(TreeNode node, List<TreeNode> list,
        Map<String, Integer> serialToCnt) {
        if (node == null) {
            return "#";
        }
        String l = serialize1(node.left, list, serialToCnt);
        String r = serialize1(node.right, list, serialToCnt);
        String serial = l + "," + r + "," + node.val;
        serialToCnt.put(serial, serialToCnt.getOrDefault(serial, 0) + 1);
        if (serialToCnt.get(serial) == 2) {
            list.add(node);
        }
        return serial;
    }
}
