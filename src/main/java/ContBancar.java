public class ContBancar {

    private int sum;

    public ContBancar(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "sum1=" + sum +
                '}';
    }

    public int addingSum(int x) {

        sum = sum + x;

        return sum;
    }
    public boolean extractSum(int y) {
        if (sum >= y) {
            System.out.println("Transaction Ok");
            return true;
        }
        System.out.println("Insufficient funds");
        return false;
    }
    public int getSum() {
        return sum;
    }
    public final void printSum(){
        int sum1;
        sum1 = sum;
        System.out.println(sum1);
        return;
    }

}
