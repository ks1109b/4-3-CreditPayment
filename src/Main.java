public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int result = (int) service.calculate(9.99, 1_000_000, 12);
        System.out.println(result);

        int result1 = (int) service.calculate(9.99, 1_000_000, 24);
        System.out.println(result1);

        int result2 = (int) service.calculate(9.99, 1_000_000, 36);
        System.out.println(result2);
    }
}