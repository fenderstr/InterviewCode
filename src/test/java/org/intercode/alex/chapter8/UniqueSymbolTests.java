package org.intercode.alex.chapter8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class UniqueSymbolTests {

    @Test
    public void uniqueTest() {
        // Входная строка имеет только уникальные символы
        String input = "Abcdefgh";
        assertTrue(UniqueSymbol.isAllCharUnique(input));

        // Входная строка имеет НЕуникальные символы
        input = "AbcdefgA";
        assertFalse(UniqueSymbol.isAllCharUnique(input));

        // Входная строка имеет НЕуникальные символы разного регистра
        input = "Abcdefga";
        assertFalse(UniqueSymbol.isAllCharUnique(input, true));
    }
}
