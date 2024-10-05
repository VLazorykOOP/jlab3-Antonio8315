import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Привіт!");

        Scanner in = new Scanner(System.in);

        // Введення даних
        System.out.print("Введіть назву компанії: ");
        String name = in.nextLine();
        System.out.print("Введіть ім'я власника компанії: ");
        String owner = in.nextLine();
        System.out.print("Введіть кількість працівників: ");
        int numEmployees = in.nextInt();
        System.out.print("Введіть рік створення компанії: ");
        int year = in.nextInt();
        System.out.print("Введіть місяць створення компанії: ");
        int month = in.nextInt();
        System.out.print("Введіть день створення компанії: ");
        int day = in.nextInt();
        System.out.print("Введіть прибуток компанії: ");
        float profit = in.nextFloat();

        Organization org = new Organization(name, owner, numEmployees, year, month, day, profit);
        org.show();

        InsuranceCompany insComp = new InsuranceCompany("Страхова-1", owner);
        insComp.show();

        OilAndGasCompany oilComp = new OilAndGasCompany("НафГаз-1", owner);
        oilComp.show();

        Factory factory = new Factory("Завод-1", owner, numEmployees, year, month, day, profit);
        factory.show();


        /////////////////////////////////////////////////////////////////////////////


        Pair money1 = new Money(5, 150);  // 5 грн 150 коп
        Pair money2 = new Money(2, 90);   // 2 грн 90 коп
        Pair complex1 = new Complex(3, 4);  // 3 + 4i
        Pair complex2 = new Complex(1, 2);  // 1 + 2i

        System.out.println("Money1: " + money1);
        System.out.println("Money2: " + money2);
        System.out.println("Money1 + Money2: " + money1.add(money2));
        System.out.println("Money1 - Money2: " + money1.subtract(money2));
        System.out.println("Money1 * 2: " + money1.multiply(2));
        System.out.println("Money1 / 2: " + money1.divide(2));


        System.out.println("\nComplex1: " + complex1);
        System.out.println("Complex2: " + complex2);
        System.out.println("Complex1 + Complex2: " + complex1.add(complex2));
        System.out.println("Complex1 - Complex2: " + complex1.subtract(complex2));
        System.out.println("Complex1 * 2: " + complex1.multiply(2));
        System.out.println("Complex1 / 2: " + complex1.divide(2));

        // Перевірка equals
        System.out.println("\nMoney1 == Money2: " + money1.equals(money2));
        System.out.println("Complex1 == Complex2: " + complex1.equals(complex2));
        in.close();
    }
}