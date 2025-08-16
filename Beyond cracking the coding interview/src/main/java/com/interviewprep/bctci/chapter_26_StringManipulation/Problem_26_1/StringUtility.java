package com.interviewprep.bctci.chapter_26_StringManipulation.Problem_26_1;

import java.util.ArrayList;
import java.util.List;

public class StringUtility {
    public static String[] split(String s, char c) {
        if(s == null || s.isEmpty()) {
            return new String[]{};
        }

        StringBuilder sb = new StringBuilder();
        List<String> splittedList = new ArrayList<>();
        for(int i = 0; i<s.length(); i++) {
            if(s.charAt(i) == c) {
                splittedList.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(s.charAt(i));
            }
        }
        if(sb.capacity() > 0) {
            splittedList.add(sb.toString());
        }

        return splittedList.toArray(new String[0]);
    }
}
