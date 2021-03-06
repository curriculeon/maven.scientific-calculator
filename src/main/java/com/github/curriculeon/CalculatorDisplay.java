package com.github.curriculeon;

/**
 * Created by leon on 10/31/2020.
 */ // TODO
public class CalculatorDisplay {
    private final IOConsole console;

    public CalculatorDisplay(IOConsole console) {
        this.console = console;
    }

    public CalculatorDisplay() {
        this(new IOConsole());
    }

    /**
     * @return the current value presented on the display
     */
    public String getDisplayValue() {
        return null;
    }

    /**
     * clear the value presented on the display
     */
    public void clearDisplayValue() {
    }

    /**
     * update the displayed value to the specified `valueToBeUpdated`
     *
     * @param valueToBeUpdated
     */
    public void updateDisplayValue(String valueToBeUpdated) {
    }

    /**
     * convert the displayed value to an expression in base eight
     */
    public void switchDisplayModeToOctal() {
    }

    /**
     * convert the displayed value to an expression in base ten
     */
    public void switchDisplayModeToDecimal() {
    }

    /**
     * convert the displayed value to an expression in base sixteen
     */
    public void switchDisplayModeToHexadecimal() {
    }

    /**
     * convert the displayed value to degrees
     */
    public void switchDisplayModeToDegrees() {
    }

    /**
     * convert the displayed value to radians
     */
    public void switchDisplayModeToRadians() {
    }

    public String getBaseMode() {
        return null;
    }

    public String getTrigonometricMode() {
        return null;
    }

    public Boolean isDisplayModeInRadians() {
        return null;
    }

    public Boolean isDisplayModeInBinary() {
        return null;
    }

    public Boolean isDisplayModeInOctal() {
        return null;
    }

    public Boolean isDisplayModeInDecimal() {
        return null;
    }

    public Boolean isDisplayModeInHexadecimal() {
        return null;
    }

    public Boolean isDisplayModeInDegrees() {
        return null;
    }
}
