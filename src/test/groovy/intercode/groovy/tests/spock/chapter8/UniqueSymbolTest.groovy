package intercode.groovy.tests.spock.chapter8

import spock.lang.Specification

/**
 *
 *
 * @author ANosov
 */
class UniqueSymbolTest extends Specification {
	def "(Java) входная строка имеет только уникальные символы (регистр не учитывается)"() {
		expect:
		intercode.java.chapter8.UniqueSymbol.isAllCharUnique(input) == response

		where:
		input                | response
		"qwertyuQ"           | true
		"qwertyYuQ"          | true
		"qwertyuioasdfghjkl" | true
	}

	def "(Java) входная строка имеет НЕуникальные символы (регистр не учитывается)"() {
		expect:
		intercode.java.chapter8.UniqueSymbol.isAllCharUnique(input) == response

		where:
		input                   | response
		"qwertyuq"              | false
		"qwewrtyyuioaasdfghjkl" | false
		"qwErtYYuq"             | false
	}

	def "(Java) входная строка имеет НЕуникальные символы (регистр учитывается)"() {
		expect:
		intercode.java.chapter8.UniqueSymbol.isAllCharUnique(input, true) == response

		where:
		input      | response
		"qwertyuq" | false
		"qwertyuQ" | false
		"qwertyYu" | false
	}

	def "(Scala) входная строка имеет только уникальные символы (регистр не учитывается)"() {
		expect:
		intercode.scala.chapter8.UniqueSymbol.isAllCharUnique(input) == response

		where:
		input                | response
		"qwertyuQ"           | true
		"qwertyYuQ"          | true
		"qwertyuioasdfghjkl" | true
	}

	def "(Scala) входная строка имеет НЕуникальные символы (регистр не учитывается)"() {
		expect:
		intercode.scala.chapter8.UniqueSymbol.isAllCharUnique(input) == response

		where:
		input                   | response
		"qwertyuq"              | false
		"qwewrtyyuioaasdfghjkl" | false
		"qwErtYYuq"             | false
	}

	def "(Scala) входная строка имеет НЕуникальные символы (регистр учитывается)"() {
		expect:
		intercode.scala.chapter8.UniqueSymbol.isAllCharUnique(input, true) == response

		where:
		input      | response
		"qwertyuq" | false
		"qwertyuQ" | false
		"qwertyYu" | false
	}
}
