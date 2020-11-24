package pro.kwongsui.leetcode.heap;

public class Solution1406 {

  public int lastStoneWeight(int[] stones) {
    if (stones.length == 1) {
      return stones[0];
    }
    int[] heaviest = new int[]{stones[0], stones[1]};
    heapify(heaviest);
    for (int i = 2; i < stones.length; i++) {
      if (stones[i] > heaviest[0]) {
        int temp = heaviest[0];
        heaviest[0] = stones[i];
        stones[i] = temp;
        heapify(heaviest);
      }
    }
    int isSmashed = 0;
    while (isSmashed != stones.length - 2) {
      smash(heaviest);
      for (int i = 2; i < stones.length; i++) {
        if (stones[i] > heaviest[0]) {
          int temp = stones[i];
          if (heaviest[0] != 0) {
            stones[i] = heaviest[0];
          } else {
            stones[i] = -1;
          }
          heaviest[0] = temp;
          heapify(heaviest);
          if (stones[i] == -1) {
            isSmashed++;
          }
        }
      }
    }

    if (heaviest[0] != 0) {
      smash(heaviest);
    }

    return heaviest[1];
  }

  private void heapify(int[] heaviest) {
    if (heaviest[0] > heaviest[1]) {
      int temp = heaviest[0];
      heaviest[0] = heaviest[1];
      heaviest[1] = temp;
    }
  }

  private void smash(int[] heaviest) {
    heaviest[1] = heaviest[1] - heaviest[0];
    heaviest[0] = 0;
  }
}
