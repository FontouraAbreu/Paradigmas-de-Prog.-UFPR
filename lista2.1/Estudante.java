public class Estudante {
    private String nome;
    private int notaFinal;

    public Estudante(String nome, int notaFinal) {
        this.setNome(nome);
        this.setNota(notaFinal);
    }

    // Setters
    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty() || nome.length() > 50)
            throw new IllegalArgumentException("Nome inválido");
        this.nome = nome;
    }

    public void setNota(int notaFinal) {
        if (notaFinal < 0 || notaFinal > 100)
            throw new IllegalArgumentException("Nota inválida");
        this.notaFinal = notaFinal;
    }
    // Setters

    // Getters
    public String getNome() {
        return this.nome;
    }

    public int getNota() {
        return this.notaFinal;
    }
    // Getters
}