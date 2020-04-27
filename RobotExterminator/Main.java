package RobotExterminator;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Udari();
        System.out.println("Ееее свърши тока.");
    }


    public static void TipObekt() {
        Scanner input = new Scanner(System.in);
        System.out.println("Въведете обектът: ");
        String object = input.nextLine();
        if (object.equals("Стол"))
            System.out.println("Прескочи");
        else if (object.equals("Стена"))
            System.out.println("Мини в страни");
        else if (object.equals("Нищо"))
            System.out.println("Продължи направо");
        else {TipObekt();}

    }
    public static void Udari(){
        TipObekt();
        int batt=0;
        int NumberofPixels = Pixels();
        while (batt<4 && (NumberofPixels%2==0)){
        Random rand = new Random();
           int randMebeli = rand.nextInt(9);
           if (randMebeli==4) System.out.println("Роботът счупи мебел!");
           else System.out.println("Само мишката го отнесе.");
           batt++;}
           Zarejdane();
        }
    public static int Pixels(){
        Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();
        int screenHeight = screenSize.height;
        int screenWidth = screenSize.width;
        //System.out.println("Писели тест" + (screenSize.height * screenSize.width));
        return screenSize.height * screenSize.width;
    }
    public static void Zarejdane(){
        Communication();
        Random rand = new Random();
        int randBateriq1 = rand.nextInt(1000);
        int randBateriq2 = rand.nextInt(1000);
        if (randBateriq1>randBateriq2) {System.out.println("Известие: Роботът беше презареден.");
        Udari();}
        else if(randBateriq1==randBateriq2) Zarejdane();

    }
    public static void Communication(){
            switch (10){
            case 10: System.out.println("I am a Robottttt 10");
            case 9: System.out.println("9");
            case 8: System.out.println("I am a Robottttt 8");
            case 7: System.out.println("7");
            case 6: System.out.println("I am a Robottttt 6");
            case 5: System.out.println("5");
            case 4: System.out.println("I am a Robottttt 4");
            case 3: System.out.println("3");
            case 2: System.out.println("I am a Robottttt 2");
            case 1: System.out.println("1"); }
        }

    }



