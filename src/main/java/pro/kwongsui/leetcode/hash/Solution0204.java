package pro.kwongsui.leetcode.hash;

public class Solution0204 {

  // 埃拉托色尼筛选法
  public int countPrimes(int n) {
    boolean[] primes = new boolean[n + 1]; // 为减少一次遍历赋值，默认false代表是质数

    for (int k = 2; k <= n / k; k++) {
      if (!primes[k]) {
        for (int i = k; i <= n / k; i++) {
          primes[k * i] = true;
        }
      }
    }

    int count = 0;
    // 0和1不是质数
    for (int i = 2; i < n; i++) {
      if (!primes[i]) {
        count++;
      }
    }

    return count;
  }
}
