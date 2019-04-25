package com.mirolyubov;

public class Normalizer {

    public String normalizeExpression(String expression) {
        expression = expression
                .replaceAll(" ", "")
                .replaceAll(",", ".")
                .replaceAll("\\(-", "(0-")
                .replaceAll("\\(\\+", "(0+");

        if (expression.charAt(0) == '-') {
            expression = "0" + expression;
        }
        return expression;
    }
}