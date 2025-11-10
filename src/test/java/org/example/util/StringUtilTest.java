package org.example.util;

import org.example.util.StringUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilTest {

    @Test
    void reverseLetters_noChanges_noLetters() {
        String string = "1!111@1";

        String result = StringUtil.reverseLetters(string);

        assertEquals(string, result);
    }

    @Test
    void reverseLetters_noChanges_oneLetterWithDigits() {
        String string = "1!111a1";

        String result = StringUtil.reverseLetters(string);

        assertEquals(string, result);
    }

    @Test
    void reverseLetters_reverse_symbolsAndLetters() {
        String string = "J@va the be$t!123";
        String expected = "t@eb eht av$J!123";

        String result = StringUtil.reverseLetters(string);

        assertEquals(expected, result);
    }

    @Test
    void reverseLetters_reverse_noSymbols() {
        String string = "Java";
        String expected = "avaJ";

        String result = StringUtil.reverseLetters(string);

        assertEquals(expected, result);
    }

    @Test
    void reverseLetters_noChanges_onlySpace() {
        String string = " ";

        String result = StringUtil.reverseLetters(string);

        assertEquals(string, result);
    }

    @Test
    void reverseLetters_noChanges_emptyString() {
        String string = "";

        String result = StringUtil.reverseLetters(string);

        assertEquals(string, result);
    }

    @Test
    void reverseLetters_noChanges_nullArgument() {
        String result = StringUtil.reverseLetters(null);

        assertNull(result);
    }

}
