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
        System.out.println("����� ��� �������� " + ollBoxersWeight + " ��!");
        double differenceWeight = boxerSecond - boxerFirst;
        System.out.println("������� � ���� �������� " + differenceWeight + " ��!");

    // Task # 3
        int banana = 5;
        int bananaWeight = 80;
        int ollBananasWeight = banana * bananaWeight;
        System.out.println("����� ��� ������� " + ollBananasWeight + " �����!");

        int milk = 2;
        int oneMilkWeight = 105;
        int ollMilkWeight = milk * oneMilkWeight;
        System.out.println("����� ��� ������ " + ollMilkWeight + " �����!");

        int icecream = 2;
        int oneIcecream = 100;
        int ollIcecreamWeight = icecream * oneIcecream;
        System.out.println("����� ��� ����������� " + ollIcecreamWeight + " �����!");

        int rawegg = 4;
        int oneRawegg = 70;
        int ollRaweggWeight = rawegg * oneRawegg;
        System.out.println("����� ��� ����� ��� " + ollRaweggWeight + " �����!");

        int breakfastWeight = ollBananasWeight + ollMilkWeight + ollIcecreamWeight + ollRaweggWeight;
        System.out.println("����� ��� �������� " + breakfastWeight + " �����!");

        int KgBreakfastwKgWeight = 1000;
        float breakfastwKgWeight = breakfastWeight/(float)KgBreakfastwKgWeight;
        System.out.println("����� ��� �������� " + breakfastwKgWeight + " ��!");


    // Task # 4
        int purposeWeight = 7;
        int grWeight = 1000;
        int grPurposeWeight = purposeWeight * grWeight;
        System.out.println("���� ���������� �������� �� " + grPurposeWeight + " �����!");

        int oneOption = 250;
        int oneOptionDay = grPurposeWeight / oneOption;
        System.out.println("��� ��������� �� 250 ����� � ����, ����������� " + oneOptionDay + " ����!");

        int twoOption = 500;
        int twoOptionDay = grPurposeWeight / twoOption;
        System.out.println("��� ��������� �� 500 ����� � ����, ����������� " + twoOptionDay + " ����!");

        int arithmeticMeanWeight = (oneOption + twoOption) / 2;
        System.out.println("������� �������������� ������ ���� � ���� " + arithmeticMeanWeight + " �����");

        int arithmeticMeanDay = grPurposeWeight / arithmeticMeanWeight;
        System.out.println("������� �������������� ���������� ���� ��� ��������� ����� " + arithmeticMeanDay + " ����");

    // Task # 5

        int salaryMasha = 67760;
        int increaseMasha = 10;
        int increaseSalaryMasha = (salaryMasha / 100) * increaseMasha;
        System.out.println("�������� ���� ����� ��������� �� " + increaseSalaryMasha + " ���.");

        int newsalaryMasha = salaryMasha + increaseSalaryMasha;
        System.out.println("�������� ���� ����� ��������� ����� ����� " + newsalaryMasha + " ���.");

        int expenditureSalaryMasha = increaseSalaryMasha * 12;
        System.out.println("������� �� ���������� �������� ���� �� ��� �������� " + expenditureSalaryMasha + " ���.");














    }
}
