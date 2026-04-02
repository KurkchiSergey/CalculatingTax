import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Выберете операцию и введите ее номер: ");
            System.out.println("1. Добавить новый доход");
            System.out.println("2. Добавить новый расход");
            System.out.println("3. Выбрать систему налогообложения");
            System.out.println("   Введите end для завершения программы");
            String input = sc.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int earnings = 0;
            int spendings = 0;
            int operationNumber = Integer.parseInt(input);
            switch (operationNumber) {
                case (1):
                    System.out.println("Введите сумму дохода: ");
                    String moneyInput = sc.nextLine();
                    int money = Integer.parseInt(moneyInput);
                    earnings += money;
                    break;
                case (2):


            }

        }
        System.out.println("Программа завершена!");
    }
}