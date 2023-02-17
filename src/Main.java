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

        public static void task1 () {
            System.out.println("Задача1");
            int a = 2000000000;
            System.out.println("Значение переменной с типом int равно " + a);
            byte b = 1;
            System.out.println("Значение переменной с типом byte равно " + b);
            short c = 31000;
            System.out.println("Значение переменной с типом short равно " + c);
            long d = 80000000;
            System.out.println("Значение переменной с типом long равно " + d);
            float e = 3.75f;
            System.out.println("Значение переменной с типом float равно " + e);
            double f = 3.0000075;
            System.out.println("Значение переменной с типом double равно " + f);

        }

        public static void task2 () {
            System.out.println("Задача2");
            float g = 27.12f;
            long h = 987678965549L;
            float z = 2.786f;
            short x = 569;
            double v = -159;
            short n = 27897;
            byte m = 67;
            System.out.println("Корректно присвоила типы переменных значениям " + g + ", " + h + ", " + z + ", " + x + ", " + v + ", " + n + ", " + m + " .");
        }
        public static void task3 () {
            System.out.println("Задача3");
            byte classA = 23;
            byte classB = 27;
            byte classC = 30;
            int totalInClasses = classA + classB + classC;
            short totalSheetsOfPaper = 480;
            int sheetsToOneStudent = totalSheetsOfPaper / totalInClasses;
            System.out.println("На каждого ученика рассчитано " + sheetsToOneStudent + " листов бумаги.");
        }

        public static void task4 () {
            System.out.println("Задача4");
            byte efficiency = 16;
            byte time1 = 2;
            byte time2 = 20;
            int work = efficiency / time1;
            int efficiency2 = work * time2;
            short time3 = 1440;
            int efficiency3 = work * time3;
            short time4 = 4320;
            int efficiency4 = work * time4;
            int time5 = 43200;
            int efficiency5 = work * time5;
            System.out.println("За 20 минут машина произвела " + efficiency2 + " штук бутылок.");
            System.out.println("За сутки машина произвела " + efficiency3 + " штук бутылок.");
            System.out.println("За 3 дня машина произвела " + efficiency4 + " штук бутылок.");
            System.out.println("За 1 месяц машина произвела " + efficiency5 + " штук бутылок.");
        }
        public static void task5 () {
            System.out.println("Задача5");
            byte totalCans = 120;
            byte whiteOneClass = 2;
            byte brownOneClass = 4;
            int totalPaintsOneClass = whiteOneClass + brownOneClass;
            int totalClass = totalCans / totalPaintsOneClass;
            int totalWhite = whiteOneClass * totalClass;
            int totalBrown = brownOneClass * totalClass;
            System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
        }
        public static void task6 () {
            System.out.println("Задача6");
            byte bananasPieces = 5;
            byte bananasGr = 80;
            int totalBananas = bananasPieces * bananasGr;
            short milkMl = 200;
            byte milkGr = 105;
            int totalMilk = milkMl * milkGr;
            byte iceCreamPieces = 2;
            byte iceCreamGr = 100;
            int totalIceCream = iceCreamPieces * iceCreamGr;
            byte eggs = 4;
            byte eggsGr = 70;
            int totalEggs = eggs * eggsGr;
            int totalWeight = totalBananas + totalMilk + totalIceCream + totalEggs;
            System.out.println("Общий вес спортзавтрака " + totalWeight + " г.");
            int kg = 1000;
            float totalWeightKg = totalWeight / (float) kg;
            System.out.println("Общий вес спортзавтрака " + totalWeightKg + " кг.");
        }
        public static void task7 () {
            System.out.println("Задача7");
            byte weightKg = 7;
            short g = 1000;
            int weightG = weightKg * g;
            short lose1 = 250;
            short lose2 = 500;
            int lose1Day = weightG / lose1;
            int lose2Day = weightG / lose2;
            System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то на это уйдёт " + lose1Day + " дней.");
            System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то на это уйдёт " + lose2Day + " дней.");
            short averageG = 300;
            int loseAverage = weightG / averageG;
            System.out.println("В среднем у спортсмена на это уйдёт " + loseAverage + " дней.");
        }
        public static void task8 () {
            System.out.println("Задача8");
            byte percent = 10;
            byte year = 12;
            int masha = 67760;
            int denis = 83690;
            int kristina = 76230;
            int increaseInMonthMasha = masha / percent;
            int totalMonthMasha = masha + increaseInMonthMasha;
            int increaseInMonthDenis = denis / percent;
            int totalMonthDenis = denis + increaseInMonthDenis;
            int increaseInMonthKristina = kristina / percent;
            int totalMonthKristina = kristina + increaseInMonthKristina;
            int increaseInYearMasha = totalMonthMasha * year;
            int beforeInYearMasha = masha * year;
            int differenceMasha = increaseInYearMasha - beforeInYearMasha;
            int increaseInYearDenis = totalMonthDenis * year;
            int beforeInYearDenis = denis * year;
            int differenceDenis = increaseInYearDenis - beforeInYearDenis;
            int increaseInYearKristina = totalMonthKristina * year;
            int beforeInYearKristina = kristina * year;
            int differenceKristina = increaseInYearKristina - beforeInYearKristina;
            System.out.println("Маша теперь получает в месяц " + totalMonthMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
            System.out.println("Денис теперь получает в месяц " + totalMonthDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
            System.out.println("Кристина теперь получает в месяц " + totalMonthKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");
        }
}