public class Main {
    private static int machinePerformance;

    public static void main(String[] args) {
        System.out.println("Переменные. Часть 2");
        // Задача 1
        System.out.println("Задача 1");
        int child = 3;
        byte apple = 8;
        short orange = 12;
        long rocket = 12L;
        float watermelon = 1.5F;
        double melon = 2.1;
        System.out.println("детей" + child);
        System.out.println("яблок" + apple + "кг");
        System.out.println("апельсин" + orange + "кг");
        System.out.println("бананов" + rocket + "кг");
        System.out.println("арбуз" + watermelon + "кг");
        System.out.println("дыня" + melon + "кг");

        // Задача 2
        System.out.println("Задача 2");
        float chery = 27.12F;
        long wheat = 987678965549L;
        double gold = 2.786;
        float silver = 3.589F;
        short potato = 569;
        short fahrenheit = -159;
        short peas = 27897;
        byte dumplings = 67;

        // Зфдача 3
        System.out.println("Задача 3");
        byte classA = 23;
        System.out.println("у Людмилы Павловны А класс" + classA + "ученика");
        byte classB = 27;
        System.out.println("у Анны сергеевны В класс" + classB + "учеников");
        byte classD = 30;
        System.out.println("у Екатерины Андреевны D класс" + classD + "учеников");
        short sheetsPaper = 480;
        System.out.println("закупленно бумаги" + sheetsPaper + "листов");
        System.out.println("БУмаги на 1 ученика" + sheetsPaper / (classA + classB + classD) + "листов");

        // Задача 4
        System.out.println("Задача 4");
        byte bottles = 16;
        byte time = 2;
        machinePerformance = bottles / time;
        System.out.println("Производительность машины за 1 мин" + machinePerformance + "шт бутылок");
        byte setTime1 = 20;
        System.out.println("Производительность машины за 20 мин" + machinePerformance * setTime1 + "шт бутылок");
        short setTime2 = 1440;
        System.out.println("Производительность машины за 1440 мин" + machinePerformance * setTime2 + "шт бутылок");
        short setTime3 = 4320;
        System.out.println("Производительность машины за 4320 мин" + machinePerformance * setTime3 + "шт бутылок");
        int setTime4 = 43200;
        System.out.println("Производительность машины за 43200 мин" + machinePerformance * setTime4 + "шт бутылок");

        // Задача 5
        System.out.println("Задача 5");
        byte paintCans = 120;
        System.out.println("всего было куплено краски" + paintCans + "банок");
        byte whitePaint = 2;
        byte brownPaint = 4;
        System.out.println("нужно белой краски на 1 класс" + whitePaint + "баноки");
        System.out.println("нужно коричневой краски на 1 класс" + brownPaint + "баноки");
        System.out.println("всего краски уходит на один класс" + (whitePaint + brownPaint) + "банок");
        int schoolClasses = paintCans / (whitePaint + brownPaint);
        System.out.println("всего классов в школе" + schoolClasses);
        System.out.println("чтобы покрасить все классы белой краской нужно" + (schoolClasses * whitePaint) + "банок");
     System.out.println("чтобы покрасить все классы коричневой краской нужно" + ( schoolClasses * brownPaint) + "банок");

        // Задача 6
        System.out.println("Задача 6");
        byte banana = 5;
        byte bananaWeight = 80;
        var bananaPortion = banana * bananaWeight;
        short milk = 200;
        byte milk100MlWeight = 105;
        var milkPortion = milk100MlWeight + milk100MlWeight;
        byte iceCreamSundae = 2;
        byte briguetteIceCream = 100;
        var iceCreamPortion = iceCreamSundae * briguetteIceCream;
        byte eggs = 4;
        byte eggsWeight = 70;
        var eggsPortion = eggs * eggsWeight;
        var weightSportsBreakfast = bananaPortion + milkPortion + iceCreamPortion +eggsPortion;
        System.out.println("вес спорт завтрака" + weightSportsBreakfast + "грамм");
        short kilogram = 1000;
        float weight1SportsBreakfast = weightSportsBreakfast / kilogram;
        System.out.println("вес спортивного завтрака" + weight1SportsBreakfast + "кг");

        // Задача 7
        System.out.println("Задача 7");
        byte needToReset = 7;
        short gramsPerKilogram = 1000;
        var gramsPer7Kilogram = needToReset * gramsPerKilogram;
        System.out.println("спортсмену нужно сбросить" + gramsPer7Kilogram + "грамм");
        short loseDaily1 = 250;
        var daysToLoseWeight1 = gramsPer7Kilogram / loseDaily1;
        System.out.println("если спортсмен будет терять 250гр ежедневно то у него уйдёт" + daysToLoseWeight1 + "дней");
        short  loseDaily2 = 500;
        var daysToLoseWeight2 = gramsPer7Kilogram / loseDaily2;
        System.out.println("если спортсмен будет терять 500гр ежедневно то у него уйдёт" + daysToLoseWeight2 + "дней");
        int daysOnAverage = (daysToLoseWeight1 + daysToLoseWeight2) / 2;
        System.out.println("может потребоваться дней в среднем" + daysOnAverage);

        // Задача 8
        System.out.println("Задача 8");

        System.out.println("зарплата Маши");
        int initialSalary = 67760;
        System.out.println("зарплата Маши до повышения" + initialSalary + "рублей");
        byte raising = 10;
        System.out.println("процент повышения зарплаты" + raising + "%");
        int salaryIncrease = (initialSalary / 100) * raising;
        System.out.println("повышение зарплаты" + salaryIncrease + "рублей");
        int salaryAfterPromotion = initialSalary + salaryIncrease;
        System.out.println("зарплата Маши после повышения" + salaryAfterPromotion + "рублей");
        byte monthsPerYear = 12;
        int annualIncomeBeforeSalaryincrease = initialSalary * monthsPerYear;
        System.out.println("годовой доход до повышения зврплаты" + annualIncomeBeforeSalaryincrease + "рублей");
        int annualIncomeAfterSalaryIncrease = monthsPerYear * salaryAfterPromotion;
        System.out.println("годовой доход после повышения зарплаты" + annualIncomeAfterSalaryIncrease + "рублей");
        var difference = annualIncomeAfterSalaryIncrease - annualIncomeBeforeSalaryincrease;
        System.out.println("разница между годовым доходом до повышения зарплаты и после" + difference + "рублей");

        System.out.println("зарплата Дениса");
        int initialSalaryD = 83690;
        System.out.println("зарплата Дениса до повышения" + initialSalaryD + "рублей");
        int salaryIncreaseD = (initialSalaryD/ 100) * raising;
        System.out.println("повышение зарплаты" + salaryIncreaseD + "рублей");
        int salaryAfterPromotionD = initialSalaryD + salaryIncreaseD;
        System.out.println("зарплата Дениса после повышения" + salaryAfterPromotionD + "рублей");
        int annualIncomeBeforeSalaryincreaseD = initialSalaryD * monthsPerYear;
        System.out.println("годовой доход до повышения зврплаты" + annualIncomeBeforeSalaryincreaseD + "рублей");
        int annualIncomeAfterSalaryIncreaseD = monthsPerYear * salaryAfterPromotionD;
        System.out.println("годовой доход после повышения зарплаты" + annualIncomeAfterSalaryIncreaseD + "рублей");
        var differenceD = annualIncomeAfterSalaryIncreaseD - annualIncomeBeforeSalaryincreaseD;
        System.out.println("разница между годовым доходом до повышения зарплаты и после" + differenceD + "рублей");

        System.out.println("зарплата Кристины");
        int initialSalaryK = 83690;
        System.out.println("зарплата Крестины до повышения" + initialSalaryK + "рублей");
        int salaryIncreaseK = (initialSalaryK/ 100) * raising;
        System.out.println("повышение зарплаты" + salaryIncreaseK + "рублей");
        int salaryAfterPromotionK = initialSalaryK + salaryIncreaseK;
        System.out.println("зарплата Крестины после повышения" + salaryAfterPromotionK + "рублей");
        int annualIncomeBeforeSalaryincreaseK = initialSalaryK * monthsPerYear;
        System.out.println("годовой доход до повышения зврплаты" + annualIncomeBeforeSalaryincreaseK + "рублей");
        int annualIncomeAfterSalaryIncreaseK = monthsPerYear * salaryAfterPromotionK;
        System.out.println("годовой доход после повышения зарплаты" + annualIncomeAfterSalaryIncreaseK + "рублей");
        var differenceK = annualIncomeAfterSalaryIncreaseK - annualIncomeBeforeSalaryincreaseK;
        System.out.println("разница между годовым доходом до повышения зарплаты и после" + differenceD + "рублей");















    }
}