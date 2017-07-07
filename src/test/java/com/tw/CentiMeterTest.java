package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentiMeterTest {
    @Test
    public void test_one_centimeter_equals_to_one_centimeter() throws Exception {
        assertEquals(Length.CentiMeter(1), Length.CentiMeter(1));
    }

    @Test
    public void test_one_centimeter_unit_is_cm() throws Exception {
        assertEquals("cm", Length.CentiMeter(1).getUnit());
    }

    @Test
    public void test_reduce_centimeter_to_meter() throws Exception {
        assertEquals(Length.Meter(0.01), Length.CentiMeter(1).reduce("m"));

    }

}
