package com.codeofcoin.equations;

public class MultiplicationEquation implements Equation{
    @Override
    public int computeEquation(int value1, int value2) {
        return value1 * value2;
    }

    @Override
    public String printEquation(int value1, int value2) {
        return String.format("%s * %s", value1, value2);
    }
}
