package com.xebia.num;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest {

    @Test
    public void should_be_able_to_divideNum() {
          float re = Sum.divideNum(10,2);
       // Assertions.assertThat(re==5f).isTrue();
        Assertions.assertThat(re).isEqualTo(5f);
    }
}