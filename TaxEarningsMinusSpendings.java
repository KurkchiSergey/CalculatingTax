public class TaxEarningsMinusSpendings {
    public static int taxEarningsMinusSpendings(int earning, int spending) {
        int tax = (earning - spending) * 15 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;// вернуть минимальнй налог 0
        }
    }
}
