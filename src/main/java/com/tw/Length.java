package com.tw;


class Length {
    private String unit;
    private double length;

    Length(double length, String unit) {
        this.length = length;
        this.unit = unit;
    }

    static Length Meter(double length) {
        return new Length(length, "m");
    }

    static Length Centimeter(double length) {
        return new Length(length, "cm");
    }



    String getUnit() {
        return this.unit;
    }

    Length reduce(String toUnit) {
        double rate = rate(getUnit(), toUnit);
        return Length.Centimeter(this.length * rate);
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

        if (Double.compare(length1.length, length) != 0) return false;
        return unit.equals(length1.unit);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = unit.hashCode();
        temp = Double.doubleToLongBits(length);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
