package com.tw;

public class Meter {
    private static String unit;
    private double length;

    public Meter(double length) {
        this.length = length;
        unit = "m";
    }


    public static String getUnit() {
        return unit;
    }

    public Meter plus(Meter addend) {
        return new Meter(this.length + addend.length);
    }

    public Meter times(int multiplier) {
        return new Meter(2);
    }

    Length reduce() {
        int rate = getRate();
        return  new CentiMeter(this.length * rate);
    }

    private int getRate() {
        return 100;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Meter meter = (Meter) object;

        return Double.compare(meter.length, length) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(length);
        return (int) (temp ^ (temp >>> 32));
    }
}
