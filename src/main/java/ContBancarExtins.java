public class ContBancarExtins extends ContBancar {


     private int rataDobanzii;
    public ContBancarExtins(int sum,int rataDobanzii) {
        super(sum);
        this.rataDobanzii = rataDobanzii;
    }

    @Override
    public String toString() {
        return "ContBancarExtins{" +
                "rataDobanzii=" + rataDobanzii + "sum2=" + getSum() +
                '}';
    }

    public int adaugaDobandaAnuala() {
        //d = suma*rata dobanzii*timpul pana la scadenta/100*365

        int montlyInterest = (getSum() * rataDobanzii * 31) / (100 * 365);

        return montlyInterest;
    }
                                                               //     public void printSum()

}
