public class PaintStore {

    public double calc(GeometricShapes[] fg){
        double sum = 0.0;

        for (GeometricShapes value:fg){
            sum +=value.getArea();
        }
        return sum;
    }

    public static void main(String[] args) {
       GeometricShapes square = new Square(20);
       GeometricShapes rightTriangle = new RightTriangle(30,40);

        GeometricShapes [] f = {square,rightTriangle};
        System.out.println(f);


    }

}
