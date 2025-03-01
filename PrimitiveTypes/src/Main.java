//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PrimitiveTypes primitiveType = new PrimitiveTypes(10,9.99, 'A', true);
        System.out.println("Suma de int "+primitiveType.integerValue+" + double "+primitiveType.decimalValue+": "+ primitiveType.getWideningValue());
        System.out.println("Conversion de double "+primitiveType.decimalValue+" a int: "+primitiveType.getCastingValue());
        System.out.println("Letra original: "+primitiveType.charValue+" -> Letra siguiente: "+primitiveType.getNextChar());
        System.out.println("Estado booleano negado: "+primitiveType.disprovedValue());
    }
}