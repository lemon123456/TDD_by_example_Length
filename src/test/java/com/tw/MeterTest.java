package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MeterTest {
    @Test
    public void test_one_meter_equals_to_one_meter() throws Exception {
        assertEquals(Length.Meter(1), Length.Meter(1));
    }

    @Test
    public void test_one_meter_unit_is_m() throws Exception {
        assertEquals("m", Length.Meter(1).getUnit());
    }

    @Test
    public void test_reduce_meter_to_centimeter() throws Exception {
        assertEquals(Length.CentiMeter(100), Length.Meter(1).reduce("cm"));
    }


//    @Test
//    public void test_one_meter_plus_one_meter() throws Exception {
//        assertEquals(Length.Meter(2), Length.Meter(1).plus(Length.Meter(1)));
//    }

//    @Test
//    public void test_one_meter_times_two() throws Exception {
//        assertEquals(Length.Meter(2), Length.Meter(1).times(2));
//    }

}
