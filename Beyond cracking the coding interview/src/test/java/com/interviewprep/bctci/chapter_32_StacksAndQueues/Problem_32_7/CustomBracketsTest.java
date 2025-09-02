package com.interviewprep.bctci.chapter_32_StacksAndQueues.Problem_32_7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CustomBracketsTest {

    @Test
    public void isValidExpressionTest() {
        String expression = "((a+b)*[c-d]-{e/f})";
        String[] brackets = new String[]{"()", "[]", "{}"};
        Assertions.assertTrue(CustomBrackets.isValidExpression(expression, brackets));

        expression = "()[}";
        brackets = new String[]{"()", "[]", "{}"};
        Assertions.assertFalse(CustomBrackets.isValidExpression(expression, brackets));

        expression = "([)]";
        brackets = new String[]{"()", "[]", "{}"};
        Assertions.assertFalse(CustomBrackets.isValidExpression(expression, brackets));

        expression = ")))(()((";
        brackets = new String[]{")("};
        Assertions.assertTrue(CustomBrackets.isValidExpression(expression, brackets));
    }
}