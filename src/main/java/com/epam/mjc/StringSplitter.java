package com.epam.mjc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringSplitter {

    /**
     * Splits given string applying all delimiters to it. Keeps order of result substrings as in source string.
     *
     * @param source source string
     * @param delimiters collection of delimiter strings
     * @return List of substrings
     */
    public List<String> splitByDelimiters(String source, Collection<String> delimiters) {
        StringBuilder regex = new StringBuilder("[");
        for (String delimiter : delimiters) {
            regex.append(delimiter);
        }
        regex.append("]");
        String[] tokens = source.split(regex.toString());
        List<String> result = new ArrayList<>();
        for (String token : tokens) {
            if (token.length() > 0) {
                result.add(token);
            }
        }
        return result;
    }
}
