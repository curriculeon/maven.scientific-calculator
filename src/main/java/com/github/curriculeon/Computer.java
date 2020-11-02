package com.github.curriculeon;

/**
 * Created by leon on 10/31/2020.
 */ // TODO
public class Computer {
    public Double add(Double firstOperand, Double secondOperand) {
        return firstOperand + secondOperand;
    }

    public Double subtract(Double firstOperand, Double secondOperand) {
        return add(firstOperand, -secondOperand);
    }

    public Double multiply(Double firstOperand, Double secondOperand) {
        return firstOperand * secondOperand;
    }

    public Double divide(Double firstOperand, Double secondOperand) {
        return firstOperand / secondOperand;
    }

    public Double inverseTangent(Double operand) {
        return Math.tan(operand);
    }

    public Double inverseCosine(Double operand) {
        return Math.acos(operand);
    }

    public Double inverseSine(Double operand) {
        return Math.asin(operand);
    }

    public Double tangent(Double operand) {
        return Math.tan(operand);
    }

    public Double cosine(Double operand) {
        return Math.cos(operand);
    }

    public Double sine(Double operand) {
        return Math.sin(operand);
    }

    public Double degrees(Double operand) {
        return Math.toDegrees(operand);
    }

    public Double radians(Double operand) {
        return Math.toRadians(operand);
    }

    public Double binary(Double operand) {
        return convertToBase(operand, 2);
    }

    public Double hexadecimal(Double operand) {
        return convertToBase(operand, 16);
    }

    public Double decimal(Double operand) {
        return convertToBase(operand, 10);
    }

    public Double octal(Double operand) {
        return convertToBase(operand, 8);
    }
    private Double convertToBase(Double valueToConvert, Integer baseToConvertTo) {
        Integer valueAsInteger = valueToConvert.intValue();
        String valueAsString = valueAsInteger.toString();
        Long valueInTheSpecifiedBaseAsLong = Long.parseLong(valueAsString, baseToConvertTo);
        Double valueInTheSpecifiedBaseAsDouble = valueInTheSpecifiedBaseAsLong.doubleValue();
        return valueInTheSpecifiedBaseAsDouble;
    }

    public Double inverseNaturalLog(Double operand) {
        return Math.exp(naturalLog(operand));
    }

    public Double naturalLog(Double operand) {
        return Math.log(operand);
    }

    @Deprecated
    public Double inverseLog(Double operand) {
        return inverseNaturalLog(operand);
    }
}
