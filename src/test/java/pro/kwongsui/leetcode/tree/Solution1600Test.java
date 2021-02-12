package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import pro.kwongsui.leetcode.tree.Solution1600.ThroneInheritance;

class Solution1600Test {

    @Test
    void test() {
        ThroneInheritance t = new ThroneInheritance("king");
        t.birth("king", "andy");
        t.birth("king", "bob");
        t.birth("king", "catherine");
        t.birth("andy", "matthew");
        t.birth("bob", "alex");
        t.birth("bob", "asha");
        assertIterableEquals(
            Arrays.asList("king", "andy", "matthew", "bob", "alex", "asha", "catherine"),
            t.getInheritanceOrder());
        t.death("bob");
        assertIterableEquals(
            Arrays.asList("king", "andy", "matthew", "alex", "asha", "catherine"),
            t.getInheritanceOrder());
    }
}