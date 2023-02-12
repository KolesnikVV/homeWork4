public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1 (){
        System.out.println("Задание 1");
        byte a = -35;
        System.out.println("Значение переменной a с типом byte равно " + a);
        short b = 222;
        System.out.println("Значение переменной b с типом short равно " + b);
        int c = 40588;
        System.out.println("Значение переменной c с типом int равно " + c);
        long d = 2548967258L;
        System.out.println("Значение переменной d с типом long равно " + d );
        float e = 5.55f;
        System.out.println("Значение переменной e с типом float равно " + e);
        double f = 12.36;
        System.out.println("Значение переменной f с типом double равно " + f);

    }
    public static void task2(){
        System.out.println("Задание 2");
        double a = 27.12;
        System.out.println("число " + a +" относится к типу переменных double");
        long b = 987678965549L;
        System.out.println("число " + b +" относится к типу переменной long");
        float c = 2.786f;
        System.out.println("число " + c + " относится к типу переменной float");
        short d = 569;
        short e = -159;
        short f = 27897;
        System.out.println("числа " + d +"," + e + "," + f + "," + " относится к типу переменной short");
        byte j = 67;
        System.out.println("число " + j + " относится к типу переменной byte");

    }
    public static void task3(){
        System.out.println("задание 3");
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        short paper = 480;
        int paperStudent = paper / (teacherLP + teacherAS + teacherEA);
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");
    }
    public static void task4(){
        System.out.println("Задание 4");
        byte bottle = 16;
        byte minetts = 2;
        int bottleOneMinets = bottle/minetts;
        int bottleTwentyMinets = bottleOneMinets * 20;
        System.out.println("За 20 минут машина произвела " + bottleTwentyMinets + " штук бутылок");
        int oneHour = bottleOneMinets * 60;
        int oneDay = oneHour * 24;
        System.out.println("За 1 сутки машина произвела " + oneDay + " штук бутылок");
        int threeDay = oneDay * 3;
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        int oneMounth = oneDay * 30;
        System.out.println("За 1 месяц машина произвела " + oneMounth + " штук бутылок");
    }
    public static void task5(){
        System.out.println("Задание 5");
        byte potPoint = 120;
        byte whitePoint = 2;
        byte brownPoint = 4;
        int allClass = potPoint / (whitePoint+brownPoint);
        int allWhitePoint = whitePoint * allClass;
        int allBrownPoint = brownPoint * allClass;
        System.out.println("В школе где " + allClass + " классов нужно " + allWhitePoint + " белой краски и " + allBrownPoint + " коричневой краски") ;
    }
    public static void task6 (){
        System.out.println("Задание 6");
        byte bananas = 5;
        byte weightBananas = 80;
        int allBananas = bananas * weightBananas;
        short allMilk = 200;
        int mlMilk = allMilk / 100;
        byte weightMilk = 105;
        int totalMilk=  mlMilk * weightMilk;
        byte icecream = 2;
        byte weightIcecream = 100;
        int allIcecream = icecream * weightIcecream;
        byte eggs = 4;
        byte oneEggs = 70;
        int allEggs = eggs * oneEggs;
        int breakfast = allBananas + totalMilk + allIcecream + allEggs;
        float breakfastToKg = allBananas + totalMilk + allIcecream + allEggs;
        float kgBreakfast = breakfastToKg / 1000;
        System.out.println("Общий вес завтрака составил " + breakfast + " грамм, или " + kgBreakfast + " килограмм");


    }
    public static void task7(){
        System.out.println("Задание 7");
        byte weightSportsmanKg = 7;
        int kgToGr = weightSportsmanKg * 1000;
        short ifOne = 250;
        short ifTwo = 500;
        int dayMax = kgToGr / ifOne;
        int dayMin = kgToGr / ifTwo;
        System.out.println("если спортсмен бедет терять по 250 грамм в день, ему потребуется " + dayMax + " дней");
        System.out.println("если спортсмен бедет терять по 500 грамм в день, ему потребуется " + dayMin + " дней");
        int average = (dayMax + dayMin) / 2;
        System.out.println("в среднем спрортсмену потребуется " + average + " день, для похудения на 7 КГ");

    }

}