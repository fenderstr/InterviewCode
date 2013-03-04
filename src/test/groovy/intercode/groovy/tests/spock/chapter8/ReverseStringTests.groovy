package intercode.groovy.tests.spock.chapter8

import spock.lang.Specification

/**
 *
 *
 * @author anosov@outlook.com
 */
class ReverseStringTests extends Specification {
    def "(Java) переворот всей входной строки"() {
        expect:
        intercode.java.chapter8.ReverseString.reverse(input) == response

        where:
        input      | response
        "qwertyu"  | "uytrewq"
        "ABCDEFGH" | "HGFEDCBA"
    }

    def "(Java) переворот только певых трех символов входной строки"() {
        expect:
        intercode.java.chapter8.ReverseString.reverse(input, 2) == response

        where:
        input      | response
        "qwertyu"  | "ewqrtyu"
        "ABCDEFGH" | "CBADEFGH"
    }

}
