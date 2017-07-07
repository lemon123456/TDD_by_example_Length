package com.tw;

public class Pair {
    private final String fromUnit;
    private final String toUnit;

    public Pair(String fromUnit, String toUnit) {
        this.fromUnit = fromUnit;
        this.toUnit = toUnit;
    }

    public String getFromUnit() {
        return fromUnit;
    }

    public String getToUnit() {
        return toUnit;
    }
}
