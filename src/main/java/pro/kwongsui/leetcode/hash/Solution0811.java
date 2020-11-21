package pro.kwongsui.leetcode.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution0811 {

  public List<String> subdomainVisits(String[] cpdomains) {
    Map<String, Integer> map = new HashMap<>();
    for (String cpdomain : cpdomains) {
      String[] cpinfo = cpdomain.split(" ");
      int count = Integer.parseInt(cpinfo[0]);
      String[] domains = cpinfo[1].split("\\.");
      String domain = "";
      for (int i = domains.length - 1; i >= 0; i--) {
        domain = domains[i] + (i < domains.length - 1 ? "." : "") + domain;
        map.put(domain, map.getOrDefault(domain, 0) + count);
      }
    }
    List<String> res = new ArrayList<>();
    for (Map.Entry entry : map.entrySet()) {
      res.add(entry.getValue() + " " + entry.getKey());
    }
    return res;
  }
}
