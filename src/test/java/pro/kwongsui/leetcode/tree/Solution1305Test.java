package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1305Test {

    @ParameterizedTest
    @CsvSource({
        "'2,1,4', '1,0,3', '0,1,1,2,3,4'",
        "'0,-10,10', '5,1,7,0,2', '-10,0,0,1,2,5,7,10'",
        "'', '5,1,7,0,2', '0,1,2,5,7'",
        "'0,-10,10', '', '-10,0,10'"
    })
    void getAllElements(@ConvertWith(IntegerArrayConverter.class) Integer[] input1,
        @ConvertWith(IntegerArrayConverter.class) Integer[] input2,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            new Solution1305().getAllElements(BinaryTree.create(input1), BinaryTree.create(input2)));
    }
}