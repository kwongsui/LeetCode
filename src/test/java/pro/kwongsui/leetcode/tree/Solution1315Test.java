package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1315Test {

    @ParameterizedTest
    @CsvSource({
        "'6,7,8,2,7,1,3,9,null,1,4,null,null,null,5', 18"
    })
    void sumEvenGrandparent(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int expected) {
        assertEquals(expected, new Solution1315().sumEvenGrandparent(BinaryTree.create(input)));
    }
}