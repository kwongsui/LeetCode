package pro.kwongsui.leetcode.util;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class NestedListConverter implements ArgumentConverter {

    @Override
    public Object convert(Object source, ParameterContext context)
        throws ArgumentConversionException {
        if (!(source instanceof String)) {
            throw new IllegalArgumentException("The argument should be a string: " + source);
        }
        try {
            List<List<Integer>> list = new ArrayList<>();
            if (((String) source).length() != 0) {
                for (String s : ((String) source).split("\\|")) {
                    List<Integer> l = new ArrayList<>();
                    for (String s1 : s.split(" ")) {
                        l.add(Integer.parseInt(s1));
                    }
                    list.add(l);
                }
            }
            return list;
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
}
