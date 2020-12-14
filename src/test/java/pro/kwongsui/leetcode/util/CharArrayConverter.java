package pro.kwongsui.leetcode.util;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class CharArrayConverter implements ArgumentConverter {

    @Override
    public Object convert(Object source, ParameterContext context)
        throws ArgumentConversionException {
        if (!(source instanceof String)) {
            throw new IllegalArgumentException("The argument should be a string: " + source);
        }
        try {
            if (((String) source).length() == 0) {
                return new int[0];
            }
            String[] chars = ((String) source).split(",");
            char[] ret = new char[chars.length];
            int idx = 0;
            for (String o : chars) {
                ret[idx++] = o.charAt(0);
            }
            return ret;
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
}
