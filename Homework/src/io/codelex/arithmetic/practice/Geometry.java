package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        if(radius.compareTo(BigDecimal.valueOf(0))<=0)throw new IllegalArgumentException("Value cannot be less than 0!");
        return radius.multiply(BigDecimal.valueOf(Math.PI)).multiply(BigDecimal.valueOf(2));
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        if(length.compareTo(BigDecimal.valueOf(0))<=0 || width.compareTo(BigDecimal.valueOf(0))<=0)throw new IllegalArgumentException("Value cannot be less than 0!");
        return length.multiply(width);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        if(base.compareTo(BigDecimal.valueOf(0))<=0 || h.compareTo(BigDecimal.valueOf(0))<=0)throw new IllegalArgumentException("Value cannot be less than 0!");
        return base.multiply(h).multiply(BigDecimal.valueOf(0.5));
    }
}
