package lista;

public class Metodos {
    static No inicio = null;
    static No fim = null;

    static void inserir(int x) {
        No novo = new No(x);

        if (inicio == null) {
            inicio = fim = novo;
            inicio.prox = inicio;
            inicio.ant = fim;

        } else {
            novo.prox = inicio;
            novo.ant = fim; 
            fim.prox = novo;
            fim = novo;
        }
    }

    static void inserirOrdenado(int x) {
        int N = x;
        for (int i = 1; i <= N; i++) {
            inserir(i);
        }
    }

    static void exibir() {

        System.out.println("---------------");

        if (inicio == null)
            System.out.println("Lista vazia, impossível exibir");
        else if (inicio == inicio.prox)
            System.out.println(inicio.valor);
        else {
            System.out.println(inicio.valor);

            No temp = inicio.prox;

            while (temp != inicio) {
                System.out.println(temp.valor);
                temp = temp.prox;
            }
        }
    }

    static void exibirInverso() {

        System.out.println("---------------");

        if (inicio == null)
            System.out.println("Lista vazia, impossível exibir");
        else if (inicio == inicio.prox)
            System.out.println(inicio.valor);
        else {
            System.out.println(fim.valor);

            No temp = fim.ant;

            while (temp != inicio) {
                System.out.println(temp.valor);
                temp = temp.ant;
            }
            System.out.println(inicio.valor);
        }
    }

    static void remover(int x) {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        No atual = inicio;
        No anterior = fim;

        do {
            if (atual.valor == x) {
                if (atual == inicio) {
                    inicio = atual.prox;
                    fim.prox = inicio;
                    inicio.ant = fim; 
                    atual = inicio;
                } else {
                    anterior.prox = atual.prox;
                    atual.prox.ant = anterior; 
                    atual = atual.prox;
                }
            } else {
                anterior = atual;
                atual = atual.prox;
            }
        } while (atual != inicio);
    }

    static void removerPrimeiro() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
    
        if (inicio == fim) {
            inicio = fim = null;
            return;
        }
    
        inicio = inicio.prox;
        fim.prox = inicio;
        inicio.ant = fim;
    }
    

    static void removerUltimo() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }
    
        if (inicio == fim) {
            inicio = fim = null;
            return;
        }
    
        No atual = inicio;
        No anterior = null;
        while (atual.prox != inicio) {
            anterior = atual;
            atual = atual.prox;
        }
    
        anterior.prox = inicio;
        fim = anterior;
        inicio.ant = fim;
    }
    


    public static void main(String[] args) {
        int N = 10;
        //inserir();
        inserirOrdenado(N);
        remover(3);
        removerPrimeiro();
        removerUltimo();
        exibir();
        exibirInverso();
    }
}