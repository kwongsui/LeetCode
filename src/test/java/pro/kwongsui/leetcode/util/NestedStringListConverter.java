package pro.kwongsui.leetcode.util;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class NestedStringListConverter implements ArgumentConverter {

    @Override
    public Object convert(Object source, ParameterContext context)
        throws ArgumentConversionException {
        if (!(source instanceof String)) {
            throw new IllegalArgumentException("The argument should be a string: " + source);
        }
        try {
            List<List<String>> list = new ArrayList<>();
            for (String o : ((String) source).split("\\|")) {
                List<String> l = new ArrayList<>();
                for (String s : o.split(",")) {
                    if (s.equals("null")) {
                        l.add(null);
                    } else {
                        l.add(s);
                    }
                }
                list.add(l);
            }
            return list;
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
}
