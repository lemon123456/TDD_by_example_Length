package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CentiMeterTest {
    @Test
    public void test_one_centimeter_equals_to_one_centimeter() throws Exception {
        assertEquals(new CentiMeter(1), new CentiMeter(1));
    }

    @Test
    public void test_one_centimeter_unit_is_cm() throws Exception {
        assertEquals("cm", CentiMeter.getUnit(new CentiMeter(1)));
    }

    @Test
    public void test_reduce_centimeter_to_meter() throws Exception {
        assertEquals(new Meter(0.01), new CentiMeter(1).reduce());

    }

}
