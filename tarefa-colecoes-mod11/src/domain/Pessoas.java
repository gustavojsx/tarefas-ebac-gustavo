package domain;

public class Pessoas implements Comparable<Pessoas> {
    private String nome;
    private String sexo;

    public Pessoas(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoas o) {
        return getNome().compareTo(o.getNome());
    }
}
