package Lession10_10;

public class RomanMapping {
    private int value;
    private String symbol;

    public RomanMapping(int value, String symbol) {
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() { return value; }
    public String getSymbol() { return symbol; }
}