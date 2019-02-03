public class Square extends GeometricShapes {

    private int lenght;

    public Square(int lenght) {
        super(lenght);
        this.lenght = lenght;
    }


    @Override
    public double getArea(){

        double area  = lenght * lenght;
        return area;
    }

}
