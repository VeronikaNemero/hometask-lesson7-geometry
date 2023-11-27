public class Triangle extends Figure{

    double sideA;

    double sideB;

    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        if (((sideA + sideB) < sideC) || ((sideB + sideC) < sideA) || ((sideA + sideC) < sideB) ) {
            System.out.println("Incorrect data. Error.");
        }
    }

    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    public double getArea(){
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}
