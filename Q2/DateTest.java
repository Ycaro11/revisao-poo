class Date {
    private int dia;
    private int mes;
    private int ano;

    public Date(int dia, int mes, int ano) {
        setAno(ano);
        setMes(mes);
        setDia(dia);
    }

    public int getDia() { return dia; }
    public void setDia(int dia) {
        if (dia > 0 && dia <= 31) { this.dia = dia; }
    }

    public int getMes() { return mes; }
    public void setMes(int mes) {
        if (mes > 0 && mes <= 12) { this.mes = mes; }
    }

    public int getAno() { return ano; }
    public void setAno(int ano) {
        if (ano > 0) { this.ano = ano; }
    }

    public void displayDate() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, ano);
    }
}

public class DateTest {
    public static void main(String[] args) {
        System.out.println("Testando datas:");
        
        Date dataValida = new Date(5, 5, 2026);
        System.out.print("Data válida: ");
        dataValida.displayDate();

        Date dataInvalida = new Date(35, 13, 2026); 
        System.out.print("Data inválida (ignora dias/meses errados): ");
        dataInvalida.displayDate();
    }
}