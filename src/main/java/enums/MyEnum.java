package enums;

public class MyEnum {

    public enum LenghtUnit {
        METER(1),
        CENTIMETER(0.01),
        FOOT(0.03),
        INCH(0.025);

        double value;
        LenghtUnit (double value) {
            this.value = value;
        }

        double convertToMetters() {
            return value;
        }
    }

    public static void main(String[] args) {

        LenghtUnit[]lenghtUnits = LenghtUnit.values();
        for(LenghtUnit lenghtUnit:lenghtUnits){
            System.out.println(lenghtUnit);
        }
        System.out.println(LenghtUnit.FOOT.convertToMetters());
        System.out.println(LenghtUnit.CENTIMETER.convertToMetters());
    }





}
