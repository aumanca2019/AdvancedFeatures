import org.junit.Test;

public class TestRightTriangle {
    @Test
    public void TestTriangle(){

        RightTriangle triangle = new RightTriangle(30,40);
        double triangleArea = triangle.getArea();
        System.out.println(triangleArea);
    }
}
