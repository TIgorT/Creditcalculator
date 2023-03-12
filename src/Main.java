public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int annuityPaymentOneYear = service.monthlyPayment(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платёж при сроке кредита на один год составляет: " + annuityPaymentOneYear + " рублей.");
        System.out.println();
        int annuityPaymentTwoYears = service.monthlyPayment(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платёж при сроке кредита на два года составляет: " + annuityPaymentTwoYears + " рублей.");
        System.out.println();
        int annuityPaymentThreeYears = service.monthlyPayment(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платёжпри сроке кредита на три года составляет: " + annuityPaymentThreeYears + " рубля.");
    }
}