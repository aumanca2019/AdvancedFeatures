public class GeometricShapes {

    public int lenght;
    public int r;
    public int area;

    public GeometricShapes(int lenght) {
        this.lenght = lenght;
    }

    public GeometricShapes(int lenght, int r, int area) {
        this.lenght = lenght;
        this.r = r;
        this.area = area;
    }

    public GeometricShapes() {
    }

    @Override
    public String toString() {
        return "GeometricShapes{" +
                "lenght=" + lenght +
                ", r=" + r +
                ", area=" + area +
                '}';
    }

    public double getArea(){
        return area;
    }
}
