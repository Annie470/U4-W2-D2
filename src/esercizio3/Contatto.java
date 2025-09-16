package esercizio3;

public class Contatto {
    private String nome;
    private long numero;

    public Contatto(String nome, long numero){
        this.nome=nome;
        this.numero=numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
