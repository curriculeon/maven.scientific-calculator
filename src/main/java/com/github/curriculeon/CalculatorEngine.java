package com.github.curriculeon;

/**
 * Created by leon on 10/31/2020.
 */ // TODO
public class CalculatorEngine {
    private Computer computer;
    private CalculatorDisplay calculatorDisplay;
    private Double currentValue;
    private IOConsole console;

    public CalculatorEngine(Computer computer, CalculatorDisplay calculatorDisplay) {
        this.computer = computer;
        this.calculatorDisplay = calculatorDisplay;
        this.console = new IOConsole(AnsiColor.RED);
        this.currentValue = null;
    }

    public CalculatorEngine() {
        this(new Computer(), new CalculatorDisplay());
    }

    private void setInitialValue() {
        setInitialValue("Enter a value");
    }

    private void setInitialValue(String prompt) {
        if (currentValue == null) {
            this.currentValue = console.getDoubleInput(prompt);
        }
    }

    public void clearDisplay() {
        calculatorDisplay.clearDisplayValue();
    }

    public void computeAddition() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to add to current value of [ %s ]", currentValue);
        Double newComputedValue = computer.add(currentValue, valueToAdd);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeSubtraction() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to subtract from current value of [ %s ]", currentValue);
        Double newComputedValue = computer.subtract(currentValue, valueToAdd);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeMultiplication() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to multiply by current value of [ %s ]", currentValue);
        Double newComputedValue = computer.multiply(currentValue, valueToAdd);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeDivision() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to divide current value of [ %s ] by", currentValue);
        Double newComputedValue = computer.divide(currentValue, valueToAdd);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeInverseNaturalLog() {

        setInitialValue("Enter the value to get inverse natural log of");
        Double newComputedValue = computer.inverseNaturalLog(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeNaturalLog() {
        setInitialValue("Enter the value to get natural log of");
        Double newComputedValue = computer.naturalLog(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeLog() {
        setInitialValue("Enter the value to get inverse log of");
        Double newComputedValue = computer.inverseLog(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeInverseTangent() {
        setInitialValue("Enter the value to get inverse tangent of");
        Double newComputedValue = computer.inverseTangent(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeInverseCosine() {
        setInitialValue("Enter the value to get inverse cosine of");
        Double newComputedValue = computer.inverseCosine(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeInverseSine() {
        setInitialValue("Enter the value to get inverse sine of");
        Double newComputedValue = computer.inverseSine(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeTangent() {
        setInitialValue("Enter the value to get tangent of");
        Double newComputedValue = computer.tangent(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeCosine() {
        setInitialValue("Enter the value to get cosine of");
        Double newComputedValue = computer.cosine(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void computeSine() {
        setInitialValue("Enter the value to get sine of");
        Double newComputedValue = computer.sine(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void convertToDegrees() {
        Double newComputedValue = computer.degrees(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void convertToRadians() {
        Double newComputedValue = computer.radians(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void convertToBinaryBase() {
        Double newComputedValue = computer.binary(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void convertToOctalBase() {
        Double newComputedValue = computer.octal(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void convertToDecimalBase() {
        Double newComputedValue = computer.decimal(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void convertToHexadecimalBase() {
        Double newComputedValue = computer.hexadecimal(currentValue);
        calculatorDisplay.updateDisplay(newComputedValue.toString());
    }

    public void display() {
        console.println(calculatorDisplay.getDisplayValue());
    }
}
