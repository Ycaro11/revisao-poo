abstract class Employee {
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;

    public Employee(String primeiroNome, String ultimoNome, String cpf) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.cpf = cpf;
    }

    public abstract double earnings(); 

    @Override
    public String toString() {
        return primeiroNome + " " + ultimoNome + " (CPF: " + cpf + ")";
    }
}

class SalariedEmployee extends Employee {
    private double salarioSemanal;

    public SalariedEmployee(String primeiroNome, String ultimoNome, String cpf, double salarioSemanal) {
        super(primeiroNome, ultimoNome, cpf);
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double earnings() { return salarioSemanal; }

    @Override
    public String toString() { return "Empregado Assalariado: " + super.toString(); }
}

class HourlyEmployee extends Employee {
    private double valorHora;
    private double horasTrabalhadas;

    public HourlyEmployee(String primeiroNome, String ultimoNome, String cpf, double valorHora, double horasTrabalhadas) {
        super(primeiroNome, ultimoNome, cpf);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double earnings() {
        if (horasTrabalhadas <= 40) {
            return valorHora * horasTrabalhadas;
        } else {
            return (40 * valorHora) + ((horasTrabalhadas - 40) * valorHora * 1.5);
        }
    }

    @Override
    public String toString() { return "Empregado Horista: " + super.toString(); }
}

public class PayrollSystemTest {
    public static void main(String[] args) {
        SalariedEmployee emp1 = new SalariedEmployee("Chico", "França", "111", 2000.0);
        HourlyEmployee emp2 = new HourlyEmployee("Julia", "Silva", "222", 50.0, 45.0);

        
        Employee[] empregados = new Employee[2];
        empregados[0] = emp1;
        empregados[1] = emp2;

        System.out.println("Processando Folha de Pagamento Polimorficamente:\n");
        for (Employee empregadoAtual : empregados) {
            System.out.println(empregadoAtual.toString());
            System.out.printf("Ganhos: R$ %.2f\n\n", empregadoAtual.earnings());
        }
    }
}