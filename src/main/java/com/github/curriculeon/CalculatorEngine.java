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

    private void computeInCurrentMode(Double newlyComputedValue) {
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
        String displayBaseMode = calculatorDisplay.getBaseMode();
        String displayTrigMode = calculatorDisplay.getTrigonometricMode();
        switch (displayBaseMode) {
            case "binary":
                convertToBinaryBase();
                break;

            case "octal":
                convertToOctalBase();
                break;

            case "hexadecimal":
                convertToHexadecimalBase();
                break;

            default:
                convertToDecimalBase();
        }
        if ("radians".equalsIgnoreCase(displayTrigMode)) {
            convertToRadians();
        } else {
            convertToDegrees();
        }

        display();
    }

    public void clearDisplay() {
        calculatorDisplay.clearDisplayValue();
    }

    public void computeAddition() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to add to current value of [ %s ]", currentValue);
        Double newlyComputedValue = computer.add(currentValue, valueToAdd);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeSubtraction() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to subtract from current value of [ %s ]", currentValue);
        Double newlyComputedValue = computer.subtract(currentValue, valueToAdd);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeMultiplication() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to multiply by current value of [ %s ]", currentValue);
        Double newlyComputedValue = computer.multiply(currentValue, valueToAdd);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeDivision() {
        setInitialValue();
        Double valueToAdd = console.getDoubleInput("Enter a value to divide current value of [ %s ] by", currentValue);
        Double newlyComputedValue = computer.divide(currentValue, valueToAdd);

        computeInCurrentMode(newlyComputedValue);
    }

    public void computeInverseNaturalLog() {
        setInitialValue("Enter the value to get inverse natural log of");
        Double newlyComputedValue = computer.inverseNaturalLog(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeNaturalLog() {
        setInitialValue("Enter the value to get natural log of");
        Double newlyComputedValue = computer.naturalLog(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeLog() {
        setInitialValue("Enter the value to get inverse log of");
        Double newlyComputedValue = computer.inverseLog(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeInverseTangent() {
        setInitialValue("Enter the value to get inverse tangent of");
        Double newlyComputedValue = computer.inverseTangent(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeInverseCosine() {
        setInitialValue("Enter the value to get inverse cosine of");
        Double newlyComputedValue = computer.inverseCosine(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeInverseSine() {
        setInitialValue("Enter the value to get inverse sine of");
        Double newlyComputedValue = computer.inverseSine(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeTangent() {
        setInitialValue("Enter the value to get tangent of");
        Double newlyComputedValue = computer.tangent(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeCosine() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.cosine(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void computeSine() {
        setInitialValue("Enter the value to get sine of");
        Double newlyComputedValue = computer.sine(currentValue);
        computeInCurrentMode(newlyComputedValue);
    }

    public void convertToDegrees() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.degrees(currentValue);
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
    }

    public void convertToRadians() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.radians(currentValue);
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
    }

    public void convertToBinaryBase() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.binary(currentValue);
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
    }

    public void convertToOctalBase() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.octal(currentValue);
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
    }

    public void convertToDecimalBase() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.decimal(currentValue);
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
    }

    public void convertToHexadecimalBase() {
        setInitialValue("Enter the value to get cosine of");
        Double newlyComputedValue = computer.hexadecimal(currentValue);
        this.currentValue = newlyComputedValue;
        calculatorDisplay.updateDisplayValue(newlyComputedValue.toString());
    }

    public void display() {
        console.println(calculatorDisplay.getDisplayValue());
    }
}
