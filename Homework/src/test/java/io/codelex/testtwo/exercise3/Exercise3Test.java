package io.codelex.testtwo.exercise3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class Exercise3Test {
    @Test
    void SingleNumberTest(){
        Joiner joiner = new Joiner("-");
        String result = joiner.join(1);
        assertThat(result, is(equalTo("1")));
    }
    @Test
    void MultipleNumbersTest(){
        Joiner joiner = new Joiner("+");
        String result = joiner.join(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(equalTo("1+2+3+4+5+6+7+8+9")));
    }
    @Test
    void StringsTest(){
        Joiner joiner = new Joiner(" ");
        String result = joiner.join("first", "second", "third");
        assertThat(result, is(equalTo("first second third")));
    }
}
