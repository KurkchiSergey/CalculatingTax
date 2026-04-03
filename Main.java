import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int earning = 0;
        int spending = 0;
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

            int operationNumber = Integer.parseInt(input);
            switch (operationNumber) {
                case (1):
                    System.out.println("Введите сумму дохода: ");
                    String moneyInput = sc.nextLine();
                    int money = Integer.parseInt(moneyInput);
                    earning += money;
                    break;
                case (2):
                    System.out.println("Введите сумму расхода: ");
                    String moneyOutput = sc.nextLine();
                    int moneyTemp = Integer.parseInt(moneyOutput);
                    spending += moneyTemp;
                    break;
                case (3):
                    int taxSavings = TaxEarningsMinusSpendings.taxEarningsMinusSpendings(earning, spending) - TaxEarnings.taxEnding(earning);
                    if (TaxEarningsMinusSpendings.taxEarningsMinusSpendings(earning, spending) > TaxEarnings.taxEnding(earning)) {
                        System.out.println("Мы советуем Вам УСН доходы");
                        System.out.println("Ваш налог составит: " + TaxEarnings.taxEnding(earning) + " рублей");
                        System.out.println("Налог на другой системе: " + TaxEarningsMinusSpendings.taxEarningsMinusSpendings(earning, spending) + " рублей");
                        System.out.println("Экономия: " + Math.abs(taxSavings) + " рублей");

                    } else if (TaxEarningsMinusSpendings.taxEarningsMinusSpendings(earning, spending) < TaxEarnings.taxEnding(earning)) {
                        System.out.println("Мы советуем Вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + TaxEarningsMinusSpendings.taxEarningsMinusSpendings(earning, spending) + " рублей");
                        System.out.println("Налог на другой системе: " + TaxEarnings.taxEnding(earning) + " рублей");
                        System.out.println("Экономия: " + Math.abs(taxSavings) + " рублей");
                    } else {
                        System.out.println("Можете выбрать любую систему налогооблажения");
                    }
                    //System.out.println("Программа завершена!");
                    break;
                default:
                    System.out.println("Такой операции нет!");
                    break;
            }

        }

        System.out.println("Программа завершена!");
    }

}
