package intercode.java.chapter8;

/**
 * Реализуйте функцию reverse. Функция должна циклически сдвигать строку,
 * заканчивающуюся символом null
 *
 * @author anosov@outlook.com
 */
public class ReverseString {

    /**
     * Меняем местами символы
     *
     * @param chars - входной массив
     * @param start - указатель первого символа
     * @param end   - указатель последнего символа
     * @return измененный массив
     */
    private static char[] swap(char[] chars, int start, int end) {
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
        return chars;
    }


    /**
     * Функция циклического сдвига строки
     *
     * @param str - входная строка
     * @return
     */
    public static String reverse(String str) {
        return reverse(str, str.length() - 1);
    }

    /**
     * Функция циклического сдвига строки
     *
     * @param str    - входная строка
     * @param offset - индекс последнего символа
     * @return
     */
    public static String reverse(String str, int offset) {
        if (offset > str.length() - 1) {
            return str;
        }
        char[] chars = str.toCharArray();
        int start = 0;
        do {
            chars = swap(chars, start, offset);
            --offset;
            ++start;
        } while (start < offset);
        return toString(chars);
    }

    private static String toString(char[] chars) {
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            sb.append(c);
        }
        return sb.toString();
    }
}
