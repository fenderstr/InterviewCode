package intercode.java.chapter8;

/**
 * стр. 63 задание 1.1
 * Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз. При выполнении
 * этого задания нельзя использовать дополнительные структуры данных
 *
 * @author nosov alexander (alexandern89@gmail.com)
 */
public class UniqueSymbol {

    /**
     * Проверка уникальности сиволов входной строки (без учета регистра)
     *
     * @param input - входная строка
     * @return true - все символы уникальны false - есть повторяющиеся символы
     */
    public static boolean isAllCharUnique(String input) {
        return isAllCharUnique(input, false);
    }


    /**
     * Проверка уникальности сиволов входной строки
     *
     * @param input       - входная строка
     * @param isCaseSense - (true|false) - учитывать/не учитывать регистр символов
     * @return true - все символы уникальны false - есть повторяющиеся символы
     */
    public static boolean isAllCharUnique(String input, boolean isCaseSense) {
        int length = input.length();
        if (length > 256) {
            return false;
        }
        if (isCaseSense) {
            input = input.toLowerCase();
        }
        for (int i = 0; i < length; i++) {
            Character symbol = input.charAt(i);
            for (int j = i + 1; j < length; j++) {
                if (symbol == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    /*
        Оценка данного метода:
            время O(n^2)
            память O(1)
     */
}
