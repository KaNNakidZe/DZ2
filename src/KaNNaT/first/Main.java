package KaNNaT.first;

public class Main {

    public static void main(String[] args) {
	// Task # 1
        byte apple = 3;
        short pear = 207;
        int cherry = 600;
        long orange = 900L;
        float watermelon = 1.5f;
        double melon = 4.7;
        boolean pearMore = true;
        System.out.println(pear);
        char dollar = 36;
        System.out.println(dollar);

    // Task # 2
        double boxerFirst = 78.2;
        double boxerSecond = 82.7;
        double ollBoxersWeight = boxerFirst + boxerSecond;
        System.out.println("Общий вес боксеров " + ollBoxersWeight + " кг!");
        double differenceWeight = boxerSecond - boxerFirst;
        System.out.println("Разница в весе боксеров " + differenceWeight + " кг!");

    // Task # 3
        int banana = 5;
        int bananaWeight = 80;
        int ollBananasWeight = banana * bananaWeight;
        System.out.println("Общий вес бананов " + ollBananasWeight + " грамм!");

        int milk = 2;
        int oneMilkWeight = 105;
        int ollMilkWeight = milk * oneMilkWeight;
        System.out.println("Общий вес молока " + ollMilkWeight + " грамм!");

        int icecream = 2;
        int oneIcecream = 100;
        int ollIcecreamWeight = icecream * oneIcecream;
        System.out.println("Общий вес мороженного " + ollIcecreamWeight + " грамм!");

        int rawegg = 4;
        int oneRawegg = 70;
        int ollRaweggWeight = rawegg * oneRawegg;
        System.out.println("Общий вес сырых яйц " + ollRaweggWeight + " грамм!");

        int breakfastWeight = ollBananasWeight + ollMilkWeight + ollIcecreamWeight + ollRaweggWeight;
        System.out.println("Общий вес завтрака " + breakfastWeight + " грамм!");

        int KgBreakfastwKgWeight = 1000;
        float breakfastwKgWeight = breakfastWeight/(float)KgBreakfastwKgWeight;
        System.out.println("Общий вес завтрака " + breakfastwKgWeight + " кг!");


    // Task # 4
        int purposeWeight = 7;
        int grWeight = 1000;
        int grPurposeWeight = purposeWeight * grWeight;
        System.out.println("Цель спортсмена похудеть на " + grPurposeWeight + " грамм!");

        int oneOption = 250;
        int oneOptionDay = grPurposeWeight / oneOption;
        System.out.println("При похудении на 250 грамм в день, потребуется " + oneOptionDay + " дней!");

        int twoOption = 500;
        int twoOptionDay = grPurposeWeight / twoOption;
        System.out.println("При похудении на 500 грамм в день, потребуется " + twoOptionDay + " дней!");

        int arithmeticMeanWeight = (oneOption + twoOption) / 2;
        System.out.println("Среднее арифмитическая потеря веса в день " + arithmeticMeanWeight + " грамм");

        int arithmeticMeanDay = grPurposeWeight / arithmeticMeanWeight;
        System.out.println("Среднее арифмитическое количество дней дня похудения равно " + arithmeticMeanDay + " дней");

    // Task # 5

        int salaryMasha = 67760;
        int increaseMasha = 10;
        int increaseSalaryMasha = (salaryMasha / 100) * increaseMasha;
        System.out.println("Зарплата Маши будут увеличена на " + increaseSalaryMasha + " руб.");

        int newsalaryMasha = salaryMasha + increaseSalaryMasha;
        System.out.println("Зарплата Маши после повышения будет равна " + newsalaryMasha + " руб.");

        int expenditureSalaryMasha = increaseSalaryMasha * 12;
        System.out.println("Расходы на увелечение зарплаты Маши за год составят " + expenditureSalaryMasha + " руб.");














    }
}
