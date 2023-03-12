public class CreditPaymentService {
    public int monthlyPayment(int moneyLoan, int loanTerm, double InterestRate) {
        double monthlyRate = InterestRate / 12 / 100; // Месячная ставка
        double annuityPayment = moneyLoan * monthlyRate * Math.pow(1 + monthlyRate, loanTerm) / (Math.pow(1 + monthlyRate, loanTerm) - 1);
        return (int) annuityPayment;
    }
}
