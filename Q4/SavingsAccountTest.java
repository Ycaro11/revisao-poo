class SavingsAccount {
    private static double annualInterestRate; 
    private double savingsBalance;

    public SavingsAccount(double saldoInicial) {
        this.savingsBalance = saldoInicial;
    }

    public void calculateMonthlyInterest() {
        double jurosMensal = (this.savingsBalance * annualInterestRate) / 12;
        this.savingsBalance += jurosMensal;
    }

    public static void modifyInterestRate(double novaTaxa) {
        annualInterestRate = novaTaxa;
    }

    public double getBalance() {
        return this.savingsBalance;
    }
}

public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("Saldos após 12 meses (Taxa de 4%):");
        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("Mês " + i + ":");
            System.out.printf("Saver 1: R$ %.2f\n", saver1.getBalance());
            System.out.printf("Saver 2: R$ %.2f\n", saver2.getBalance());
        }
       

        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("\nSaldos após mais 1 mês (Taxa de 5%):");
        System.out.printf("Saver 1: R$ %.2f\n", saver1.getBalance());
        System.out.printf("Saver 2: R$ %.2f\n", saver2.getBalance());
    }
}