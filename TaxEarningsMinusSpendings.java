public class TaxEarningsMinusSpendings {
    public static int taxEarningsMinusSpendings(int earning, int spendings) {
        int tax = (earning - spendings) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }
    }
}
