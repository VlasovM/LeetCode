package ru.javlasov.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DisplayName("Reverse string")
class ReverseStringTest {

    ReverseString reverseString = new ReverseString();

    @Test
    void testScenarioFirst() {
        System.out.println("----------------------------------------");
        System.out.println("scenario first: ");
        char[] input = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] expected = new char[]{'o', 'l', 'l', 'e', 'h'};

        System.out.println("input value: " + Arrays.toString(input) + " | expected result: " + Arrays.toString(expected));

        reverseString.reverseString(input);
        assertThat(input).isEqualTo(expected);
        System.out.println("----------------------------------------");
    }


}