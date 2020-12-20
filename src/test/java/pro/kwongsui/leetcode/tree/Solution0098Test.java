package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.tree.Solution0098;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0098Test {

    @ParameterizedTest
    @CsvSource({
        "'', 'true'",
        "'1', 'true'",
        "'1,2', 'false'",
        "'1,1', 'false'",
        "'1,null,2', 'true'",
        "'1,1,1', 'false'",
        "'2,1,3', 'true'",
        "'5,1,4,null,null,3,6', 'false'",
        "'5,4,6,null,null,3,7', 'false'",
        "'3,1,5,0,2,4,6', 'true'",
        "'5,4,8,null,null,6,9,3', 'false'",
        "'120,70,140,50,100,130,160,20,55,75,110,119,135,150,200', 'false'",
        "'120,70,140,50,100,130,160,20,55,75,122,125,135,150,200', 'false'",
        "'120,70,140,50,100,130,160,20,55,75,110,125,135,150,200', 'true'"
    })
    void isValidBST(@ConvertWith(IntegerArrayConverter.class) Integer[] input, boolean output) {
        assertEquals(output, new Solution0098().isValidBST(BinaryTree.create(input)));
    }
}