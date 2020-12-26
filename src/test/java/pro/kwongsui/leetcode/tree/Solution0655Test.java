package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0655Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2', '0,1,0|2,0,0'",
        "'1,2,3,null,4','0,0,0,1,0,0,0|0,2,0,0,0,3,0|0,0,4,0,0,0,0'",
        "'1,2,5,3,null,null,null,4',"
            + "'0,0,0,0,0,0,0,1,0,0,0,0,0,0,0|"
            + "0,0,0,2,0,0,0,0,0,0,0,5,0,0,0|"
            + "0,3,0,0,0,0,0,0,0,0,0,0,0,0,0|"
            + "4,0,0,0,0,0,0,0,0,0,0,0,0,0,0'"
    })
    void printTree(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        assertIterableEquals(expected, new Solution0655().printTree(BinaryTree.create(input)));
    }
}