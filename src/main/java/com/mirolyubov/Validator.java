package com.mirolyubov;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {

    public boolean isNumber(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean validate(String expression) {

        boolean findBadSymbols = isContainsNotNumbers(expression);
        boolean findBadSymbols2 = isRepeatOps(expression);
        boolean findBadSymbols3 = isContainsOperatorsBetweenBrackets(expression);
        boolean findBadSymbols4 = isContainsNumNearBrackets(expression);

        if (findBadSymbols | findBadSymbols2 | findBadSymbols3 | findBadSymbols4) {
            return false;
        } else {
            return true;
        }
    }

    private boolean isContainsNotNumbers(String expression) {
        Matcher matcherForNotNumbers = Pattern.compile("[^(.)/*\\-+0-9]").matcher(expression);
        return matcherForNotNumbers.find();
    }

    private boolean isRepeatOps(String expression) {
        Matcher matcherForRepeatOps = Pattern.compile("[./*\\-+]{2,}").matcher(expression);
        return matcherForRepeatOps.find();
    }

    private boolean isContainsOperatorsBetweenBrackets(String expression) {
        Matcher matcherForBrackets = Pattern.compile("[(][/*][(]|[)][/*][)]").matcher(expression);
        return matcherForBrackets.find();
    }

    private boolean isContainsNumNearBrackets(String expression) {
        Matcher matcherForNumNearBrackets = Pattern.compile("[\\d?.]+[(]|[)][\\d?.]+").matcher(expression);
        return matcherForNumNearBrackets.find();
    }

}
