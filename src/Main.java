public class Main {
    public static void main(String[] args) {
        //Задача 1
        byte b = 0;
        short s = 0;
        int i = 0;
        long l = 0;
        float f = 0;
        double d = 0;
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        //Задача 2
        float f1 = 27.12f;
        long l1 = 987678965549L;
        float f2 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27987;
        byte b1 = 67;

        //Задача3
        byte lp = 23, as = 27, ea = 30;
        short papers = 480;
        System.out.println("На каждого ученика рассчитано " + papers / (lp+as+ea) + " листов бумаги");

        //Задача4
        byte bottle = 16;
        byte min = 2;
        short hours24 = (short) (60 * 24 / min);
        int days3 = hours24 * 3;
        int month = hours24 * 30;
        System.out.println("За 20 минут машина произвела " + bottle * 10 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottle * hours24 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottle * days3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottle * month + " штук бутылок");

        //Задача5
        byte paintNeed = 120;
        byte whitePaintOneClass = 2;
        byte brownPaintOneClass = 4;
        byte classCount = (byte) (paintNeed / (whitePaintOneClass + brownPaintOneClass));
        System.out.println("В школе, где " + classCount + " классов, нужно " + classCount * whitePaintOneClass +
                " банок белой краски и " + classCount * brownPaintOneClass + " банок коричневой краски");

        //Задача6
        byte banana = 80, milk100 = 105, iceCream = 100, egg = 70;
        short recipe = (short) (banana * 5 + milk100 * 2 + iceCream * 2 + egg * 4);
        byte kiloRecipe = (byte) (recipe / 1000);
        System.out.println("Спортзавтрак в граммах: " + recipe + "г.");
        System.out.println("Спортзавтрак в килограммах: " + kiloRecipe + "кг.");

        //Задача7
        byte weightKg = 7;
        short lose250 = (short) (weightKg * 1000 / 250);
        short lose500 = (short) (weightKg * 1000 / 500);
        short midLose = (short) ((lose500 + lose250) / 2);
        System.out.println("Если худеть на 250 грамм в день, то 7кг уйдёт за " + lose250 + " дней");
        System.out.println("Если худеть на 500 грамм в день, то 7кг уйдёт за " + lose500 + " дней");
        System.out.println("Если худеть в среднем от 250 до 500 грамм в день, то 7кг уйдёт за " + midLose + " день");

        //Задача8
        int masha = 67760, denis = 83690, kristina = 76230;
        int yearMasha = masha * 12, yearDenis = denis * 12, yearKristina = kristina * 12;
        masha = masha / 10 + masha;
        denis = denis / 10 + denis;
        kristina = kristina / 10 + kristina;
        System.out.println("Маша теперь получает " + masha + " рублей. Годовой доход вырос на " + (masha * 12 - yearMasha) + " рубля");
        System.out.println("Денис теперь получает " + denis + " рублей. Годовой доход вырос на " + (denis * 12 - yearDenis) + " рублей");
        System.out.println("Кристина теперь получает " + kristina + " рубля. Годовой доход вырос на " + (kristina * 12 - yearKristina) + " рублей");
    }
}