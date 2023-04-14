import java.time.LocalDate;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public int GetDia() {
        return this.dia;
    }

    public int GetMes() {
        return this.mes;
    }

    public int GetAno() {
        return this.ano;
    }

    // set the day
    public void setDia(int dia) {
        // if the day is invalid, return 0
        if (dia >= 1 || dia <= 31) {
            this.dia = dia;
        }
    }

    // set the month
    public void setMes(int mes) {
        if (mes >= 1 || mes <= 12) {
            this.mes = mes;
        }
    }

    // set the year
    public void setAno(int ano) {
        if (ano >= 0 && ano <= LocalDate.now().getYear()) {
            this.ano = ano;
        }
    }

    public void ajustarData(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public void imprimirData() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}