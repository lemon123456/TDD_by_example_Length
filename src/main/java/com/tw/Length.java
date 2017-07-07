package com.tw;

import java.util.Hashtable;

class Length {
    private static String unit;
    double length;


    Length(double length, String unit) {
        this.length = length;
        Length.unit = unit;
    }

    static Length Meter(double length) {
        return new Length(length, "m");
    }

    static Length CentiMeter(double length) {
        return new Length(length, "cm");
    }

    static String getUnit() {
        return unit;
    }

    Length reduce(String toUnit) {
        double rate = rate(getUnit(), toUnit);
        return Length.CentiMeter(this.length * rate);
    }


    private double rate(String fromUnit, String toUnit) {
        double rate = 1;

        if (fromUnit.equals("m") && toUnit.equals("cm")) {
            rate = 100;
        }
        if (fromUnit.equals("cm") && toUnit.equals("m")) {
            rate = 0.01;
        }
        return rate;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Length length1 = (Length) object;

        return Double.compare(length1.length, length) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }

//    Length times(int multiplier) {
//        return new Length(this.length * multiplier, getUnit());
//    }


}
