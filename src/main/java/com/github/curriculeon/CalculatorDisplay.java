package com.github.curriculeon;

/**
 * Created by leon on 10/31/2020.
 */ // TODO
public class CalculatorDisplay {
    private final IOConsole console;
    private String baseMode;
    private String trigonometricMode;
    private String displayValue;

    public CalculatorDisplay(IOConsole console) {
        this.console = console;
        this.baseMode = "decimal";
        this.trigonometricMode = "degrees";
        this.displayValue = null;
    }

    public CalculatorDisplay() {
        this(new IOConsole());
    }

    /**
     * @return the current value presented on the display
     */
    public String getDisplayValue() {
        return this.displayValue;
    }

    /**
     * clear the value presented on the display
     */
    public void clearDisplayValue() {
        this.displayValue = null;
    }

    /**
     * update the displayed value to the specified `valueToBeUpdated`
     *
     * @param valueToBeUpdated
     */
    public void updateDisplayValue(String valueToBeUpdated) {
        this.displayValue = valueToBeUpdated;
    }

    /**
     * convert the displayed value to an expression in base eight
     */
    public void switchDisplayModeToOctal() {
        this.baseMode = "octal";
    }

    /**
     * convert the displayed value to an expression in base ten
     */
    public void switchDisplayModeToDecimal() {
        this.baseMode = "decimal";
    }

    /**
     * convert the displayed value to an expression in base sixteen
     */
    public void switchDisplayModeToHexadecimal() {
        this.baseMode = "hexadecimal";
    }

    /**
     * convert the displayed value to degrees
     */
    public void switchDisplayModeToDegrees() {
        this.trigonometricMode = "degrees";
    }

    /**
     * convert the displayed value to radians
     */
    public void switchDisplayModeToRadians() {
        this.trigonometricMode = "radians";
    }

    public String getBaseMode() {
        return this.baseMode;
    }

    public String getTrigonometricMode() {
        return this.trigonometricMode;
    }

    public Boolean isDisplayModeInDegrees() {
        return !isDisplayModeInRadians();
    }

    public Boolean isDisplayModeInRadians() {
        return "radians".equalsIgnoreCase(getTrigonometricMode());
    }

    public Boolean isDisplayModeInBinary() {
        return "binary".equalsIgnoreCase(getBaseMode());
    }

    public Boolean isDisplayModeInOctal() {
        return "octal".equalsIgnoreCase(getBaseMode());
    }

    public Boolean isDisplayModeInDecimal() {
        return "decimal".equalsIgnoreCase(getBaseMode());
    }

    public Boolean isDisplayModeInHexadecimal() {
        return "hexadecimal".equalsIgnoreCase(getBaseMode());
    }
}
