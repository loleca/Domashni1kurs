package Domashna21vi;

import java.time.Month;

public class Main {

    public static void main(String[] args) {
        perimeter();
        face();
        DaysInMonth();
        SkachamPrezTerasata();
    }
    public static void perimeter() {
        int a=2;
        int b=6;
        int parameter= (a+b)*2;
        System.out.println("Периметърът е: "+ parameter);
    }

    public static void face() {
        int a=2;
        int b=6;
        int face= a*b;
        System.out.println("Лицето е: "+ face);
    }
    public static void DaysInMonth() {
        int MonthNumber= 3;
         /* String monthName;
         int January=31, February=28,March=31, April=30, May=31, June=30, July=31,August=31,September=30,
        October=31,November=30,December=31;*/

        if (MonthNumber == 1|| MonthNumber==3|| MonthNumber==5|| MonthNumber==7|| MonthNumber==8
                || MonthNumber==10|| MonthNumber==12)
            System.out.println("Месецът има 31 dni");
        else if(MonthNumber==4|| MonthNumber==6|| MonthNumber==9|| MonthNumber==11)
            System.out.println("Месецът има 30 dni");
        else System.out.println("Месецът има 28 dni");

    }
    public static void SkachamPrezTerasata(){
        int etaj =8;
        switch(etaj){
            case 8: System.out.println("zdr 8mi etaj");
            case 7: System.out.println("zdr 7mi etaj");
            case 6: System.out.println("zdr 6ti etaj");
            case 5: System.out.println("zdr 5ti etaj");
            case 4: System.out.println("zdr 4ti etaj");
            case 3: System.out.println("zdr 3ti etaj");
            case 2: System.out.println("zdr 2ri etaj");
            case 1: System.out.println("Pochti sum dolu eksdee");
            case 0: System.out.println("au4");

        }

    }
}