import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private Data data;

    public void nascer(String nome, Data data) {
        this.nome = nome;
        this.data = data;
    }

    public String retornarNome() {
        return this.nome;
    }

    public int retornarIdade() {
        return this.calcularIdade(this.data);
    }

    public int calcularIdade(Data data) {
        LocalDate todayDate = LocalDate.now();
        LocalDate personBirthdate = LocalDate.of(data.GetAno(), data.GetMes(), data.GetDia());
        return todayDate.getYear() - personBirthdate.getYear();
    }
}
