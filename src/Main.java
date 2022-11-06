public class Main {
    private static String w;

    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        int money = 15_000;
        int total = 0;
        int p = 1;
        while (total < 2_459_000) {
            total = total + money;
            p++;
        }
        System.out.println("Месяц " + p + " накопленная сумма равна " + total + " рублей.");

        //Задача 2
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.println(i);
        }
        for (int a = 10; a >= 0; a--)
            System.out.println(a);

        //Задача 3
        System.out.println("Задача 3");
        int y = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int difference = birthRate - mortality;
        for (int t = 1; t <= 10; t++) {
            y += y * difference / 1000;
        }
        System.out.println(y);

        //Задача 4
        System.out.println("Задача 4");
        int money1 = 15_000;
        int total1 = 0;
        for (int w = 1; total1 < 12_000_000; w++) {
            total1 += money1 + (total1 * 7 / 100);
            System.out.println("Месяц " + w + " накопленная сумма равна " + total1 + " рублей.");
        }

        //Задача 5
        System.out.println("Задача 5");
        int money2 = 15_000;
        int total2 = 0;
        for (int n = 1; total2 < 12_000_000; n++) {
            total2 += money2 + (total2 * 7 / 100);
            if (n % 6 == 0) {
                System.out.println("Месяц " + n + " накопленная сумма равна " + total2 + " рублей.");
            }
        }

        //Задача 6
        System.out.println("Задача 6");
        int money3 = 15_000;
        int total3 = 0;
        for (int l = 1; l <= 9 * 12; l++) {
            total3 += money3 + (total3 * 7 / 100);
            if (l % 6 == 0) {
                System.out.println("Месяц " + l + " накопленная сумма равна " + total3 + " рублей.");
            }
        }

        //Задача 7
        System.out.println("Задача 7");
        int friday = 2;
        for (int day = friday; day <= 31; day = day + 7)
            System.out.println("Пятница - " + day + "-е число. Необходимо модготовить отчет.");

        //Задача 8
        System.out.println("Задача 8");
        int cometTrajectory =79;
        for (int year=1822; year<=2122; year++) {
            if (year % cometTrajectory ==0) {
                System.out.println(year);
            }
        }

        //Задача 9
        System.out.println("Задача 9");
        int q=2;
        for (int h=0; h<=10;h++)
            System.out.println(q+"*"+h+"="+q*h);
    }
}

