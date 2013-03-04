package intercode.scala.chapter8

/**
 * стр. 63 задание 1.1
 * Реализуйте алгоритм, определяющий, все ли символы в строке встречаются один раз. При выполнении
 * этого задания нельзя использовать дополнительные структуры данных
 *
 * @author nosov alexander (alexandern89@gmail.com)
 */
object UniqueSymbol {

  /**
   * Проверка уникальности сиволов входной строки (без учета регистра)
   *
   * @param input - входная строка
   * @return true - все символы уникальны
   *         false - есть повторяющиеся символы
   */
  def isAllCharUnique(input: String): Boolean = isAllCharUnique(input, isCaseSense = false)


  /**
   * Проверка уникальности сиволов входной строки
   *
   * @param input       - входная строка
   * @param isCaseSense - (true|false) - учитывать/не учитывать регистр символов
   * @return true - все символы уникальны
   *         false - есть повторяющиеся символы
   */
  def isAllCharUnique(input: String, isCaseSense: Boolean): Boolean = {
    val string: String = {
      if (isCaseSense) input.toLowerCase else input
    }

    val lenght: Int = string.length() - 1
    if (lenght >= Byte.MaxValue) return false
    val cache = new Array[Int](Char.MaxValue)

    string.foreach(char => {
      if (cache(char) != 0) return false else cache(char) = 1
    })

    true
  }

}