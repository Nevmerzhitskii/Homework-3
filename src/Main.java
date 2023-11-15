public class Main {
    public static void main(String[] args) {

        System.out.println("Зaдача № 1 " );
        byte a = 120;
        short b = 32000;
        int c = 35000;
        long d = 3000000000L;
        float e = 1.1234567f;
        double f = 1.12345678910123456;

        System.out.println("Значение перменной a  c типом  byte равно " + a);
        System.out.println("Значение перменной b  c типом  short равно " + b);
        System.out.println("Значение перменной c  c типом  int равно " + c);
        System.out.println("Значение перменной d  c типом  long равно " + d);
        System.out.println("Значение перменной e  c типом  float равно " + e);
        System.out.println("Значение перменной f  c типом  double равно " + f);

        System.out.println(" Задача №2");

        byte a1 = 67;
        short b1 = 569;
        int c1 = 27897;
        long d1 = 987678965549L;
        float e1 = 2.786f;
        double f1 = 27.12;

        System.out.println(" Задача №3");

        byte studentsLudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaAndreevna = 30;
        short paperQuality = 480;
        int allStudents = studentsLudmilaPavlovna + studentsAnnaSergeevna + studentsEkaterinaAndreevna;

        System.out.println("На каждого ученика рассчитано " + paperQuality / allStudents + " листов бумаги" );

        System.out.println(" Задача №4");

        byte perfomanceMachineTwoMinutes = 16;
        int perfomanceMacineOneMinutes = perfomanceMachineTwoMinutes / 2;
        byte twantyMinetsPeromance = 20;

        System.out.println("За 20 минут машина произвела "
                + twantyMinetsPeromance * perfomanceMacineOneMinutes + " штук бутылок");

        short oneDayPerfomance = 60 * 24;
        System.out.println("За сутки машина произвела " + oneDayPerfomance + " штук бутылок");

        int threeDaysPerfomance = oneDayPerfomance * 3;
        System.out.println("За 3 дня машина произвела " + threeDaysPerfomance + " штук бутылок");

        int oneMonthPerfomance = oneDayPerfomance * 30;
        System.out.println("За месяц машина произвела " + oneMonthPerfomance + " штук бутылок");

        System.out.println(" Задача №5");


        byte whiteColorOneClass = 2;
        byte brawnColorOneClass = 4;
        int qualityClass = 120 / (whiteColorOneClass + brawnColorOneClass);
        int whiteColorQuality = qualityClass * whiteColorOneClass;
        int brawnColorQuality = qualityClass * brawnColorOneClass;
       System.out.println( "В школе где " + qualityClass + " классов, нужно " +
               whiteColorQuality + " банок белой краски и " + brawnColorQuality + " банок коричневой краски");

        System.out.println(" Задача №6");

        short banana = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short agg = 4 * 70;

        int mixedIngredients = banana + milk + iceCream + agg;
        System.out.println(" Вес завтрака равен " + mixedIngredients + " грамм");

        float mixedIngredientsConvertKg = mixedIngredients / 1000f;
        System.out.println(" Вес завтрака равен " + mixedIngredientsConvertKg + " килограмм");

        System.out.println(" Задача №7");

        int weightNeedLoseGrams = 7 * 1000;
        short dailyWeightLoseFirstProgram = 250;
        int firstDietProgramDays = weightNeedLoseGrams / dailyWeightLoseFirstProgram;
        System.out.println("На похудение уйдет " + firstDietProgramDays + " дней при ежедневной потере "
                + dailyWeightLoseFirstProgram + " грамм" );

        short dailyWeightLoseSecondProgram = 500;
        int secondDietProgramDays = weightNeedLoseGrams / dailyWeightLoseSecondProgram;
        System.out.println("На похудение уйдет " + secondDietProgramDays + " дней при ежедневной потере "
                + dailyWeightLoseSecondProgram + " грамм" );
        int middleDaysNeedToLoseWeight =   (firstDietProgramDays + secondDietProgramDays) / 2 ;
        System.out.println( "В среднем на похудение уйдет " + middleDaysNeedToLoseWeight );

        System.out.println(" Задача №8");

        int salaryMashaMonth = 67760;
        int salaryDenisMonth = 83690;
        int salaryKristinaMonth = 76230;

        int salaryMashaYear = salaryMashaMonth * 12;
        int salaryDenisYear  = salaryDenisMonth * 12;
        int salaryKristinaYear = salaryKristinaMonth * 12;

        int salaryMashaMonthAfterIncreace = (salaryMashaMonth / 100) * 10 + salaryMashaMonth;
        int salaryDenisMonthAfterIncreace = (salaryDenisMonth / 100) * 10 + salaryDenisMonth;
        int salaryKristinaMonthAfterIncreace = (salaryKristinaMonth / 100) * 10 + salaryKristinaMonth;

        int differentMashaYearSalary = (salaryMashaMonthAfterIncreace * 12) - salaryMashaYear;
        int differentDenisYearSalary = (salaryDenisMonthAfterIncreace * 12) - salaryDenisYear;
        int differentKristinaYearSalary = (salaryKristinaMonthAfterIncreace * 12) - salaryKristinaYear;

        System.out.println("Маша теперь получает " + salaryMashaMonthAfterIncreace +
                " ее годовой заработок вырос на " + differentMashaYearSalary + " рублей" );

        System.out.println("Денис теперь получает " + salaryDenisMonthAfterIncreace +
                " его годовой заработок вырос на " + differentDenisYearSalary + " рублей" );

        System.out.println("Кристина теперь получает " + salaryDenisMonthAfterIncreace +
                " ее годовой заработок вырос на " + differentKristinaYearSalary + " рублей" );




















































    }


}