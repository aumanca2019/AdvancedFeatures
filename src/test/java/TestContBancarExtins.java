import org.junit.Test;

public class TestContBancarExtins {

    @Test
    public void TestMontlyInterest() {
        ContBancarExtins two = new ContBancarExtins(4950, 45);
        int ban = two.adaugaDobandaAnuala();
        two.addingSum(ban);
        System.out.println(two.toString());



    ContBancar mama = new ContBancarExtins(5000, 25);
        System.out.println(mama.toString());


}
}
