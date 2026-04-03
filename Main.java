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
                    int tax1 = TaxEarningsMinusSpendings.taxEarningsMinusSpendings(earning, spending);// сохраним в tax1 расчет УСН 15%
                    int tax2 = TaxEarnings.taxEnding(earning); //сохраним в tax2 расчет УСН 6%
                    int taxSavings = Math.abs(tax1 - tax2);
                    if (tax1 > tax2) {
                        System.out.println("Мы советуем Вам УСН доходы");
                        System.out.println("Ваш налог составит: " + tax2 + " рублей");
                        System.out.println("Налог на другой системе: " + tax1 + " рублей");
                        System.out.println("Экономия: " + taxSavings + " рублей");

                    } else if (tax1 < tax2) {
                        System.out.println("Мы советуем Вам УСН доходы минус расходы");
                        System.out.println("Ваш налог составит: " + tax1 + " рублей");
                        System.out.println("Налог на другой системе: " + tax2 + " рублей");
                        System.out.println("Экономия: " + taxSavings + " рублей");
                    } else {
                        System.out.println("Можете выбрать любую систему налогооблажения");
                    }
                    break;
                default:
                    System.out.println("Такой операции нет!");
                    break;
            }
        }
        System.out.println("Программа завершена!");
    }

}
