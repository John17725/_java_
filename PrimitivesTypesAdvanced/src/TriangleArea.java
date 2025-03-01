public class TriangleArea {
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleArea(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    private double computeSemiperimeter(){
        return (sideA + sideB + sideC) / 2;
    }

    public double computeArea(){
        double semiperimeter = computeSemiperimeter();
        return Math.sqrt(semiperimeter*(semiperimeter-sideA)*(semiperimeter-sideB)*(semiperimeter-sideC));
    }
}
