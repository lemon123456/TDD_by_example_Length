package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeterTest {
    @Test
    public void test_one_meter_equals_to_one_meter() throws Exception {
        assertEquals(new Meter(1), new Meter(1));
    }

    @Test
    public void test_one_meter_unit_is_m() throws Exception {
        assertEquals("m", new Meter(1).getUnit());
    }

    @Test
    public void test_reduce_meter_to_centimeter() throws Exception {
        assertEquals(new CentiMeter(100), new Meter(1).reduce());
    }


    @Test
    public void test_one_meter_plus_one_meter() throws Exception {
        assertEquals(new Meter(2), new Meter(1).plus(new Meter(1)));
    }

    @Test
    public void test_one_meter_times_two() throws Exception {
        assertEquals(new Meter(2), new Meter(1).times(2));
    }

}
