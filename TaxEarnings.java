public class TaxEarnings {
    public static int taxEnding(int ending) {
        int tax = ending * 6 / 100;
        if (tax >= 0) {
            return tax;
        } else {
            return 0;
        }

    }
}
