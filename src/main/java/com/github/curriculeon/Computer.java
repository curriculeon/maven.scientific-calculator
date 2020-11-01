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
        int baseToConvertTo = 2;
        String operandAsString = operand.toString();
        Long valueInBaseTwoAsLong = Long.parseLong(operandAsString, baseToConvertTo);
        Double valueInBaseTwoAsDouble = valueInBaseTwoAsLong.doubleValue();
        return valueInBaseTwoAsDouble;
    }

    public Double hexadecimal(Double operand) {
        int baseToConvertTo = 16;
        String operandAsString = operand.toString();
        Long valueInBaseTwoAsLong = Long.parseLong(operandAsString, baseToConvertTo);
        Double valueInBaseTwoAsDouble = valueInBaseTwoAsLong.doubleValue();
        return valueInBaseTwoAsDouble;
    }

    public Double decimal(Double operand) {
        int baseToConvertTo = 10;
        String operandAsString = operand.toString();
        Long valueInBaseTwoAsLong = Long.parseLong(operandAsString, baseToConvertTo);
        Double valueInBaseTwoAsDouble = valueInBaseTwoAsLong.doubleValue();
        return valueInBaseTwoAsDouble;
    }

    public Double octal(Double operand) {
        int baseToConvertTo = 8;
        String operandAsString = operand.toString();
        Long valueInBaseTwoAsLong = Long.parseLong(operandAsString, baseToConvertTo);
        Double valueInBaseTwoAsDouble = valueInBaseTwoAsLong.doubleValue();
        return valueInBaseTwoAsDouble;
    }

    public Double inverseNaturalLog(Double operand) {
        return null;
    }

    public Double naturalLog(Double operand) {
        return null;
    }

    public Double inverseLog(Double operand) {
        return null;
    }
}
