public class PrimitiveTypes {
    int integerValue;
    double decimalValue;
    char charValue;
    boolean booleanValue;


    public PrimitiveTypes(int integerValue, double decimalValue, char charValue, boolean booleanValue) {
        this.integerValue = integerValue;
        this.decimalValue = decimalValue;
        this.charValue = charValue;
        this.booleanValue = booleanValue;
    }
    /**
     * Conversion implicita
     * Widening
     */
    public double getWideningValue() {
        return integerValue + decimalValue;
    }

    /**
     * Conversion explicita
     * (Casting)
     */
    public int getCastingValue() {
        return (int) decimalValue;
    }

    /**
     * Operacion con caracteres
     */
    public char getNextChar() {
        return (char)  (charValue + 1);
    }

    public boolean disprovedValue() {
        return !booleanValue;
    }
}
