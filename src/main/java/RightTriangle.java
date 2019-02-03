public class RightTriangle extends GeometricShapes {
    int lenght1;
    int lenght2;

    public RightTriangle(int lenght1,int lenght2) {
        this.lenght1 = lenght1;
        this.lenght2 = lenght2;
    }

    @Override
    public double getArea(){
        double area2 = (lenght1 * lenght2)/2;
        return area2;
    }
}
