package lista;


public class ListaLigadaCircular {
    static No inicio = null;
    static No fim = null;


    static void josephus(int n, int s){
        
        while(inicio!=inicio.prox){
            for(int i=1;i<s-1;i++)
                inicio = inicio.prox;
            //System.out.println("Matando: "+temp.prox.valor);
            inicio.prox = inicio.prox.prox;
            inicio = inicio.prox;
        }
    }
    
    static void inserir(int x){
        No novo = new No(x);
        
        if(inicio == null){
            inicio = fim = novo;
            inicio.prox = inicio;

        }else{
            novo.prox = inicio;
            fim.prox = novo;
            fim = novo;
        }
    }
    
    
    static void exibir(){
        
        System.out.println("---");
        
        if(inicio == null)
            System.out.println("Lista vazia, impossível exibir");
        else
            if(inicio == inicio.prox)
                System.out.println(inicio.valor);
            else{
                System.out.println(inicio.valor);
                
                No temp = inicio.prox;

                while(temp != inicio){
                    System.out.println(temp.valor);
                    temp = temp.prox;
                }
            }
        
    }

    static void calcS(){
        int N = 1583;
        int S = 1;
        int P = 761;

        do {
            inicio = fim = null;
            for (int i = 1; i <= N; i++) {
                inserir(i);
            }
            josephus(P, S);
            S++;
        }while(inicio.valor != P);
        
        S--;
        
        System.out.println("Tamanho do Circulo: " + N+"\nNumero de Saltos: " + S+"\nSua Posicao no Circulo: "+P+"\nSobrevivente: "+inicio.valor);
    }

    public static void main(String[] args) {
        calcS();
    }
}