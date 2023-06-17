package lista;

public class llPrimos {
    static No inicio = null;
    static No fim = null;

    static void inserir(int x) {
        No novo = new No(x);

        if (inicio == null) {
            inicio = fim = novo;
            inicio.prox = inicio;

        } else {
            novo.prox = inicio;
            fim.prox = novo;
            fim = novo;
        }
    }

    static void exibir() {

        System.out.println("---");

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

    static boolean verifPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void removerPrimos() {
        if (inicio == null) {
            System.out.println("Lista vazia");
            return;
        }

        No atual = inicio;
        No anterior = fim;

        do {
            if (verifPrimo(atual.valor)) {
                if (atual == inicio) {
                    inicio = atual.prox;
                    fim.prox = inicio;
                    atual = inicio;
                } else {
                    anterior.prox = atual.prox;
                    atual = atual.prox;
                }
            } else {
                anterior = atual;
                atual = atual.prox;
            }
        } while (atual != inicio);
    }

    public static void main(String[] args) {
        int N = 22;
        for (int i = 1; i <= N; i++) {
            inserir(i);
        }
        removerPrimos();
        exibir();
    }
}
