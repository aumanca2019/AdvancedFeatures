import org.junit.Test;

public class TestSquare {

   @Test
   public void TestSquare() {
       Square square = new Square(20);
       double squareArea = square.getArea();
       System.out.println(squareArea);

   }
}
