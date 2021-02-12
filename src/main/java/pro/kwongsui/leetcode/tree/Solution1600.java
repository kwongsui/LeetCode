package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution1600 {

    static class ThroneInheritance {

        String king;

        Map<String, List<String>> map;

        Set<String> set;

        public ThroneInheritance(String kingName) {
            king = kingName;
            map = new HashMap<>();
            set = new HashSet<>();
        }

        public void birth(String parentName, String childName) {
            map.computeIfAbsent(parentName, k -> new ArrayList<>());
            map.get(parentName).add(childName);
            map.computeIfAbsent(childName, k -> new ArrayList<>());
        }

        public void death(String name) {
            set.add(name);
        }

        public List<String> getInheritanceOrder() {
            List<String> list = new ArrayList<>();
            dfs(king, list);
            return list;
        }

        private void dfs(String parent, List<String> list) {
            if(!set.contains(parent)) {
                list.add(parent);
            }
            for(String name : map.get(parent)) {
                dfs(name, list);
            }
        }
    }
}
