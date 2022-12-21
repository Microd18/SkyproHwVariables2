public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задание 1");

        int a = 150150;
        byte b = 120;
        short c = 2500;
        long d = 4815162342L;
        float e = 3.14159265F;
        double f = 36.6;

        System.out.println("Значение переменной \"a\" с типом int равно " + a);
        System.out.println("Значение переменной \"b\" с типом byte равно " + b);
        System.out.println("Значение переменной \"c\" с типом short равно " + c);
        System.out.println("Значение переменной \"d\" с типом long равно " + d);
        System.out.println("Значение переменной \"e\" с типом float равно " + e);
        System.out.println("Значение переменной \"f\" с типом double равно " + f);
    }

    public static void task2() {
        System.out.println("Задание 2");

        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        char d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
    }

    public static void task3() {
        System.out.println("Задание 3");

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short paper = 480;
        int paperPerOne = paper / (studentsAS + studentsEA + studentsLP);

        System.out.println("На каждого ученика рассчитано " + paperPerOne + " листов бумаги.");
    }

    public static void task4() {
        System.out.println("Задание 4");

        byte bottlesPerMin = 16 / 2;
        int twentyMin = bottlesPerMin * 20;
        int oneDay = bottlesPerMin * 60 * 24;
        int threeDays = oneDay * 3;
        int oneMonth = oneDay * 30; // при условии что в месяце 30 дней

        System.out.println("За 20 минут машина произвела " + twentyMin + " штук бутылок.");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + threeDays + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + oneMonth + " штук бутылок.");

    }

    public static void task5() {
        System.out.println("Задание 5");

        byte totalTin = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        int numberOfClasses = totalTin / (whiteColor + brownColor);
        int totalWhiteColor = numberOfClasses * whiteColor;
        int totalBrownColor = numberOfClasses * brownColor;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + totalWhiteColor +
                " банок белой краски и " + totalBrownColor + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задание 6");
        byte bananasCount = 5;
        byte milkCount = 2;
        byte iceCreamCount = 2;
        byte eggCount = 4;
        byte oneBananaWeight = 80;
        byte milk100Weight = 105;
        byte iceCreamWeight = 100;
        byte oneEggWeight = 70;

        int totalWeightGr = bananasCount * oneBananaWeight + milkCount * milk100Weight + iceCreamCount * iceCreamWeight + eggCount * oneEggWeight;
        float totalWeightKg = totalWeightGr / 1000F;

        System.out.println("Вес завтрака в граммах: " + totalWeightGr + " грамм.");
        System.out.println("Вес завтрака в килограммах: " + totalWeightKg + " килограмм.");

    }

    public static void task7() {
        System.out.println("Задание 7");

        short excessWeight = 7000;
        short plan1 = 250;
        short plan2 = 500;
        int result1 = excessWeight / plan1;
        int result2 = excessWeight / plan2;
        float averagePlan = (plan1 + plan2) / 2F;
        float averageResult = excessWeight / averagePlan;

        System.out.println("Если спортсмен будет терять " + plan1 + "гр. в день, то он похудеет за " + result1 + " дней.");
        System.out.println("Если спортсмен будет терять " + plan2 + "гр. в день, то он похудеет за " + result2 + " дней.");
        System.out.println("Средний результат " + averageResult + " дней.");
    }

    public static void task8() {
        System.out.println("Задание 8");

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;

        int mashaYearSalary = masha * 12;
        int denisYearSalary = denis * 12;
        int kristinaYearSalary = kristina * 12;

        float masha10 = masha * 1.1F;
        float denis10 = denis * 1.1F;
        float kristina10 = kristina * 1.1F;

        float mashaYearSalary10 = masha10 * 12;
        float denisYearSalary10 = denis10 * 12;
        float kristinaYearSalary10 = kristina10 * 12;

        System.out.println("Маша теперь получает " + masha10 + " рублей. Годовой доход вырос на " + (mashaYearSalary10 - mashaYearSalary) + " рублей.");
        System.out.println("Денис теперь получает " + denis10 + " рублей. Годовой доход вырос на " + (denisYearSalary10 - denisYearSalary) + " рублей.");
        System.out.println("Маша теперь получает " + kristina10 + " рублей. Годовой доход вырос на " + (kristinaYearSalary10 - kristinaYearSalary) + " рублей.");
    }
}