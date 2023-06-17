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

    private static void remover(int x) {
        if(inicio == null)
            System.out.println("Lista Circular VAZIA, nada a remover !");
        else{        
            //verificando se o nó a ser removido é o início 
            if(inicio.valor == x){
                //se for igual ao inicio, verificando se só existe esse nó
                if(inicio.prox == inicio)
                    inicio = fim = null;
                else{
                    inicio = inicio.prox;
                    fim.prox = inicio;
                }
            }else{ // se o nó a ser removido nao for o inicio, bora procurar esse no
                No temp = inicio;
                while( (temp.prox != inicio) && (temp.prox.valor != x) )
                    temp = temp.prox;
                if(temp.prox == inicio)
                    System.out.println("Nó com valor "+x+" não encontrado, nada foi removido.");
                else{
                    if(temp.prox == fim) //verificando se o temp.prox é o fim
                        fim = temp;
                    temp.prox = temp.prox.prox;
                }
                
            }
        }
    }

    static boolean verifPrimo(int n) {
        // Corner case
        if (n <= 1)
            return false;
  
        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
  
        return true;
    }

    static void primo(int N) {
        int x = 1;

        for (int i = 1; i <= N; i++) {
            if (verifPrimo(x) == false) {
                remover(x);
            }
            x++;
        }
    }

    public static void main(String[] args) {
        int N = 22;
        for (int i = 1; i <= N; i++) {
            inserir(i);
        }
        exibir();
        primo(N);
        exibir();
    }
}
