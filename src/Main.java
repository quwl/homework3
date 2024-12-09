public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 10;
        byte b = 1;
        short c = 2;
        long e = 1000L;
        float f = 19.10F;
        double g = 23.21;
        System.out.println("Значение переменной 'a' с типом int равно " + a);
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 'c' с типом short равно " + c);
        System.out.println("Значение переменной 'e' с типом long равно " + e);
        System.out.println("Значение переменной 'f' с типом float равно " + f);
        System.out.println("Значение переменной 'g' с типом double равно " + g);

        System.out.println("Задание 2");
        float n = 27.12F;
        long v = 987678965549L;
        double m = 2.786;
        short x = 569;
        short i = -159;
        int p = 27897;
        byte q = 67;

        System.out.println("Задание 3");
        byte ludP = 23;
        byte annS = 27;
        byte ekAn = 30;
        short paper = 480;
        short paperEvery = (short) (paper / ( (ludP + annS + ekAn)));
        System.out.println("На каждого ученика рассчитано " + paperEvery + " листов бумаги");

        System.out.println("Задание 4");
        int bottlesPerMin = 16/2;
        int timeOne = 2;
        int timeTwo = 20;
        int timeThree = timeOne * 30 * 24;
        int timeFour = timeThree * 3;
        int timeFive = timeFour * 11;
        System.out.println("За " + timeTwo + " минут машина произвела " + (bottlesPerMin * timeTwo) + " бутылок");
        System.out.println("За сутки машина произвела " + (bottlesPerMin * timeThree) + " бутылок");
        System.out.println("За 3 дня машина произвела " + (bottlesPerMin * timeFour) + " бутылок");
        System.out.println("За 1 месяц машина произвела " + (bottlesPerMin * timeFive) + " бутылок");

        System.out.println("Задание 5");
        byte allPaint = 120;
        byte whiteP = 2;
        byte brownP = 4;
        byte classes = (byte) (allPaint / (whiteP + brownP));
        System.out.println("В школе, где " + classes + " классов, нужно " + classes * whiteP + " банок белой краски и " + classes * brownP + " банок коричневой краски");

        System.out.println("Задание 6");
        float banana = 5*80F;
        float milk = ((float) 200/100)*105F;
        float iceCream = 2*100F;
        float egg = 4*70F;
        System.out.println("Вес в граммах = " + (banana + milk + iceCream + egg));
        System.out.println("Вес в килограммах = " + (banana + milk + iceCream + egg)/1000.0);

        System.out.println("Задание 7");
        int goal = 7*1000;
        System.out.println(goal/250 + " дней потребуется для похудения, если атлет будет терять по 250 грамм в день");
        System.out.println(goal/500 + " дней потребуется для похудения, если атлет будет терять по 500 грамм в день");
        System.out.println((goal/250 + goal/500)/2 + " дней в среднем потребуется для похудения");

        System.out.println("Задание 8");
        float masha = 67760F;
        float denis = 83690F;
        float kris = 76230F;
        System.out.println("Маша теперь получает " + (masha/100)*110 + " рублей. Годовой доход вырос на " + ((((masha/100)*110)*12) - (masha*12)) + " рублей");
        System.out.println("Денис теперь получает " + (denis/100)*110 + " рублей. Годовой доход вырос на " + ((((denis/100)*110)*12) - (denis*12)) + " рублей");
        System.out.println("Кристина теперь получает " + (kris/100)*110 + " рублей. Годовой доход вырос на " + ((((kris/100)*110)*12) - (kris*12)) + " рублей");
    }
}