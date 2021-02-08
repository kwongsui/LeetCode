package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0968Test {

    @ParameterizedTest
    @CsvSource({
        "'0,1,2,3,4,3,4', dba",
        "'25,1,3,1,3,0,2', adz",
        "'2,2,1,null,1,0,null,0', abc"
    })
    void smallestFromLeaf(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        String expected) {
        assertEquals(expected, new Solution0968().smallestFromLeaf(BinaryTree.create(input)));
    }
}