package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class LengthTest {
    @Test
    public void test_one_meter_equals_to_one_meter() throws Exception {
        assertEquals(Length.Meter(1), Length.Meter(1));
    }

    @Test
    public void test_one_meter_not_equals_to_one_centimeter() throws Exception {
        assertNotEquals(Length.Meter(1), Length.Centimeter(1));
    }

    @Test
    public void test_reduce_meter_to_centimeter() throws Exception {
        assertEquals(Length.Centimeter(100), Length.Meter(1).reduce("cm"));
    }


}
