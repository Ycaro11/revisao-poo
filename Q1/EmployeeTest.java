class Employee {
    private String primeiroNome;
    private String ultimoNome;
    private double salarioMensal;

    public Employee(String primeiroNome, String ultimoNome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        setSalarioMensal(salarioMensal);
    }

    public String getPrimeiroNome() { return primeiroNome; }
    public void setPrimeiroNome(String primeiroNome) { this.primeiroNome = primeiroNome; }

    public String getUltimoNome() { return ultimoNome; }
    public void setUltimoNome(String ultimoNome) { this.ultimoNome = ultimoNome; }

    public double getSalarioMensal() { return salarioMensal; }
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0.0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("João", "Silva", 3000.00);
        Employee emp2 = new Employee("Maria", "Souza", -1500.00);

        System.out.println("Salário Anual Inicial:");
        System.out.println(emp1.getPrimeiroNome() + ": R$ " + (emp1.getSalarioMensal() * 12));
        System.out.println(emp2.getPrimeiroNome() + ": R$ " + (emp2.getSalarioMensal() * 12));

        System.out.println("\nAplicando aumento de 10%...");
        emp1.setSalarioMensal(emp1.getSalarioMensal() * 1.10);
        emp2.setSalarioMensal(emp2.getSalarioMensal() * 1.10);

        System.out.println("\nNovo Salário Anual:");
        System.out.println(emp1.getPrimeiroNome() + ": R$ " + (emp1.getSalarioMensal() * 12));
        System.out.println(emp2.getPrimeiroNome() + ": R$ " + (emp2.getSalarioMensal() * 12));
    }
}