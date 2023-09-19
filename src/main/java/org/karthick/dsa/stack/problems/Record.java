package org.karthick.dsa.stack.problems;

public class Record {

    private final String symbol;

    private final Integer outStackPrecedence;

    private final Integer inStackPrecedence;

    public Record(String symbol, Integer outStackPrecedence, Integer inStackPrecedence) {
        this.symbol = symbol;
        this.outStackPrecedence = outStackPrecedence;
        this.inStackPrecedence = inStackPrecedence;
    }


    public String getSymbol() {
        return symbol;
    }

    public Integer getOutStackPrecedence() {
        return outStackPrecedence;
    }

    public Integer getInStackPrecedence() {
        return inStackPrecedence;
    }
}
