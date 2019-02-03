import org.junit.Test;

public class TestContBancar {

    @Test
    public void TestAddingSum(){
        ContBancar one = new ContBancar(4500);
        one.addingSum(450);
        one.extractSum(4000);
        one.printSum();
        System.out.println(one.toString());
        System.out.println(one.getSum());

        final ContBancar c1 = new ContBancar(2500);
        ContBancarExtins contSmecher = new ContBancarExtins(4700, 45);
        //c1 = contSmecher; cannot assign a valur to a final variabile
        final int X = 10000;
       // x = x/2;
       // System.out.println(c1.);
        c1.addingSum(200);
        c1.printSum();
        System.out.println(c1.toString());


    }

}
