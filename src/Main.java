public class Main {
    public static void main(String[] args) {

        Figure[] figure = {new Triangle(3.2, 8.1, 5.0), new Rectangle(4.1, 8.0), new Circle(5.2)};

        double allPerimeter = 0.0;

        for (Figure figure1 : figure) {
            allPerimeter += figure1.getPerimeter();
        }

        System.out.println("The sum of perimeters of all figures is 0" + allPerimeter);
    }
}