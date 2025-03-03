public class MathArrayDemo {
    private int[] numbers;
    private double[] roots;

    public MathArrayDemo(int[] numbers) {
        this.numbers = numbers;
        this.roots = new double[numbers.length];
    }

    public double[] getSqareRoot() {
        for (int i = 0; i < numbers.length; i++) {
            roots[i] = Math.sqrt(numbers[i]);
        }
        return roots;
    }

    public double[] getCubeRoot() {
        for (int i = 0; i < numbers.length; i++) {
            roots[i] = Math.pow(numbers[i], 3);
        }
        return roots;
    }
}
