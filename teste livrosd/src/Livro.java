public class Livro {
    private String nome;
    private String autor;
    private Livro proximo;

    public Livro(String nome, String autor) {
        this.nome = nome;
        this.autor = autor;
        this.proximo = null;
    }

    public String getNome() {
        return this.nome;
    }

    public String getAutor() {
        return this.autor;
    }

    public Livro getProximo() {
        return this.proximo;
    }

    public void setProximo(Livro livro) {
        this.proximo = livro;
    }
}

