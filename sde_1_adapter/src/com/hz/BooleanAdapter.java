package com.hz;

import java.util.ArrayList;

public class BooleanAdapter {
    public BooleanAdapter() {}

    /*
        This method takes a string value and compares it to an array of values.
        It returns true if the value matches any of the items in the array.
     */
    public boolean checkEquals(String value, String[] args) {
        boolean result = false;
        for (String arg : args) {
            if (arg.equals(value)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
