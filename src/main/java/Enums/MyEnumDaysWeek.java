package Enums;

enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURSDAY;

     Days(){
         System.out.println("I like: " + this.toString());

    }
    public void dayInfo(){
        System.out.println("Every day has 24 h");
    }
}

public class MyEnumDaysWeek {
    Days day;
    public MyEnumDaysWeek(Days day){
        this.day = day;
    }
    public void dayIs(){
        switch (day){
            case MONDAY:
                System.out.println("Monday is worst");break;
            case TUESDAY:
                System.out.println("Tuesday is nice");break;
            case WEDNESDAY:
                System.out.println("Wednesday is so-so");break;
            case SATURSDAY:
                System.out.println("Weekend is here");break;
                default:
                    System.out.println("All days are special");break;
        }

    }

    public static void main(String[] args) {
        String s1 = "MONDAY";
        MyEnumDaysWeek test1 = new MyEnumDaysWeek(Days.valueOf(s1));
        test1.dayIs();
        Days arr[] = Days.values();
        for(Days d : arr){
            System.out.println(d + " at index " + d.ordinal());
        }
        Days test2 = Days.MONDAY;
        System.out.println(test2);
        test2.dayInfo();

    }
}
