public class ListaLivros {
    private Livro primeiro;
    private int tamanho;

    public ListaLivros() {
        this.primeiro = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.primeiro == null;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void adicionar(String nome, String autor) {
        Livro novoLivro = new Livro(nome, autor);

        if (estaVazia()) {
            this.primeiro = novoLivro;
        } else {
            Livro atual = this.primeiro;

            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }

            atual.setProximo(novoLivro);
        }

        this.tamanho++;
    }

    public void imprimir() {
        Livro atual = this.primeiro;

        while (atual != null) {
            System.out.println("Livro: " + atual.getNome() + ", Autor: " + atual.getAutor());
            atual = atual.getProximo();
        }
    }

    public static void main(String[] args) {
        ListaLivros listaLivros = new ListaLivros();

        listaLivros.adicionar("Dom Casmurro", "Machado de Assis");
        listaLivros.adicionar("Memórias Póstumas de Brás Cubas", "Machado de Assis");
        listaLivros.adicionar("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        listaLivros.adicionar("Cem Anos de Solidão", "Gabriel García Márquez");

        listaLivros.imprimir();
    }
}
