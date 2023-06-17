package listas;

public class filaCirc {
    static No inicio = null;
    static No fim = null;
    static int save;

    public static void inserir(int n) {
        save = N;
        for (int x = 1; x <= n; x++) {
            No novo = new No(x);
            if (inicio == null) {
                inicio = fim = novo;
            } else {
                fim.proximo = novo;
                fim = novo;
            }
            fim.proximo = inicio;
        }
    }

    public static void salto(int N) {
        No temp1 = inicio;
        No temp2 = inicio;
        for(int i = 1; i < N; i++){
            temp2 = temp2.proximo;
        }
        for(int i = 1; i < N; i++){
            if(temp1 == temp2){

            }
        }
        System.out.println(temp1.valor);
    }

    public static void exibir() {
        if (inicio == null) {
            System.out.println("Lista VAZIA, nada a exibir !");
        } else {
            No temp = inicio;
            do {
                System.out.printf("%d ", temp.valor);
                temp = temp.proximo;
            } while (temp != fim.proximo);
        }
    }

    public static void main(String[] args) {
        inserir(6);
        salto(3);
        exibir();
    }
}