public class TaxEarnings {
    public static int taxEnding(int earning) {
        int tax = earning * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }

    }
}
