import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int idade;
    private int dia;
    private int mes;
    private int ano;

    public void nascer(String nome, int dia, int mes, int ano) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarIdade() {
        return this.calcularIdade(this.ano, this.mes, this.dia);
    }

    public int calcularIdade(int ano, int mes, int dia) {
        LocalDate todayDate = LocalDate.now();
        LocalDate personBirthdate = LocalDate.of(ano, mes, dia);
        return todayDate.getYear() - personBirthdate.getYear();
    }
}
