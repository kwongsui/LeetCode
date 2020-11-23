package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution0107Test {

  @Test
  void levelOrderBottom() {
    TreeNode node = BinaryTree.create(new Integer[]{3, 9, 20, null, null, 15, 7});
//    List<List<Integer>> list = new ArrayList<>();
//    list.add(Arrays.asList(15, 7));
//    list.add(Arrays.asList(9, 20));
//    list.add(Collections.singletonList(3));
    Assertions.assertIterableEquals(Arrays.asList(
        Arrays.asList(15, 7),
        Arrays.asList(9, 20),
        Collections.singletonList(3)),
        Solution0107.levelOrderBottom(node));
  }
}