package com.github.curriculeon.calculatorengine;

import com.github.curriculeon.Computer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 10/31/2020.
 */
public class MultiplyTest {
    // given
    private void test(Double firstValue, Double secondValue, Double expectedValue) {
        Computer computer = new Computer();

        // when
        Double actualValue = computer.multiply(firstValue, secondValue);

        // then
        Assert.assertEquals(expectedValue, actualValue);
    }


    @Test
    public void test1() {
        test(5.0,10.0,50.0);
    }

    @Test
    public void test2() {
        test(2.0,5.0,10.0);
    }
}
