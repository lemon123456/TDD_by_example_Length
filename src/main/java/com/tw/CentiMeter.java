package com.tw;

class CentiMeter extends Length {

    private static String unit;
    private final double length;

    CentiMeter(double length) {
        this.length = length;
        this.unit = "cm";
    }

    static String getUnit(Length length) {
        return unit;
    }

    Meter reduce() {
        return new Meter(this.length * rate());
    }

    private double rate() {
        return 0.01;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        CentiMeter that = (CentiMeter) object;

        return Double.compare(that.length, length) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }
}
