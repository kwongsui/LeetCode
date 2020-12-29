package pro.kwongsui.leetcode.util;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class NestedIntArrayConverter implements ArgumentConverter {

    @Override
    public Object convert(Object source, ParameterContext context)
        throws ArgumentConversionException {
        if (!(source instanceof String)) {
            throw new IllegalArgumentException("The argument should be a string: " + source);
        }
        try {
            if (((String) source).length() == 0) {
                return new int[0][];
            }
            String[] from = ((String) source).split("\\|");
            int[][] arr = new int[from.length][2];
            if (from.length != 0) {
                for (int i = 0; i < from.length; i++) {
                    int[] to = new int[2];
                    to[0] = Integer.parseInt(from[i].split(",")[0]);
                    to[1] = Integer.parseInt(from[i].split(",")[1]);
                    arr[i] = to;
                }
            }
            return arr;
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
}
