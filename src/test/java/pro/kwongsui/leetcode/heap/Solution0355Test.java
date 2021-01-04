package pro.kwongsui.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.heap.Solution0355.Twitter;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0355Test {

    @ParameterizedTest
    @CsvSource({
//        "1, 2, 5, 6, '5', '6,5'",
        "1, '5,3,101,13,10,2,94,505,333,22,11', '11,22,333,505,94,2,10,13,101,3'"
    })
    void test(int followerId,
        @ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        Twitter twitter = new Twitter();
        for (int id : input) {
            twitter.postTweet(followerId, id);
        }
        assertIterableEquals(Arrays.asList(expected), twitter.getNewsFeed(followerId));
    }
}