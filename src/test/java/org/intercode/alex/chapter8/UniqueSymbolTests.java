package org.intercode.alex.chapter8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueSymbolTests {

    @Test
    public void uniqueTest() {
        String input = "Abcdefgh";
        assertTrue("Входная строка имеет только уникальные символы",
                UniqueSymbol.isAllCharUnique(input));

        input = "AbcdefgA";
        assertFalse("Входная строка имеет НЕуникальные символы",
                UniqueSymbol.isAllCharUnique(input));

        input = "Abcdefga";
        assertFalse("Входная строка имеет НЕуникальные символы разного регистра",
                UniqueSymbol.isAllCharUnique(input, true));

        input = "Abcdefgh";
        assertTrue("Входная строка имеет только уникальные символы",
                intercode.scala.chapter8.UniqueSymbol.isAllCharUnique(input));

        input = "AbcdefgA";
        assertFalse("Входная строка имеет НЕуникальные символы",
                intercode.scala.chapter8.UniqueSymbol.isAllCharUnique(input));

        input = "Abcdefga";
        assertFalse("Входная строка имеет НЕуникальные символы разного регистра",
                intercode.scala.chapter8.UniqueSymbol.isAllCharUnique(input, true));

    }
}
