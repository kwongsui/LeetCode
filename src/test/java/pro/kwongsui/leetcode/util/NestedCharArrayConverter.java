package pro.kwongsui.leetcode.util;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class NestedCharArrayConverter implements ArgumentConverter {

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
            char[][] arr = new char[from.length][];
            if (from.length != 0) {
                for (int i = 0; i < from.length; i++) {
                    String[] elements = from[i].split(",");
                    char[] to = new char[elements.length];
                    for (int j = 0; j < to.length; j++) {
                        to[j] = elements[j].charAt(0);
                    }
                    arr[i] = to;
                }
            }
            return arr;
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
}
