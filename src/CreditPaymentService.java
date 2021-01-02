public class CreditPaymentService {

    public double calculate (double percent, int amount, int mounth) {

        double i = percent / 12 / 100;
        double a = 1 + i;
        double b = Math.pow(a, mounth);
        double K = (i * b) / (b - 1);
        int result = (int) (K * amount);
        return result;

    }
}
