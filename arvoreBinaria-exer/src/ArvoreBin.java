public class ArvoreBin {
    static Noa raiz = null;
    static Noa temp = null;
    static Noa tempM = null;
    static int tempt;


    public static void inserir(int x){
        Noa novo = new Noa(x);

        if(raiz == null)
            raiz = novo;

        else{

            Noa temp = raiz;
            boolean inseriu = false;

            while(!inseriu){
                if(novo.valor <= temp.valor){
                    if(temp.esq == null){
                        temp.esq = novo;
                        inseriu = true;
                    }else{
                        temp = temp.esq;
                    }
                }else{
                    if(temp.dir == null){
                        temp.dir = novo;
                        inseriu = true;
                    }else{
                        temp = temp.dir;
                    }
                }
            }
        }
    }
    public static void exibir(Noa temp){
        if(temp != null){
            exibir(temp.esq);
            System.out.println(temp.valor);
            exibir(temp.dir);
        }
    }

    public static void maior(Noa temp){
        Noa novo = new Noa(1);
        tempM = novo;
        if(temp != null){
            maior(temp.esq);
            maior(temp.dir);
            if(tempM.valor < temp.valor){
                tempM.valor = temp.valor;
            }
        }
    }

    public static void menor(Noa temp){
        tempt = raiz.valor;
        if(temp != null){
            if(temp.valor < tempt){
                tempt = temp.valor;
            }
            maior(temp.esq);
        }
    }

    public static void profundidadeArv(){

    }

    public static void profundidadeNo(){

    }

    public static void main(String[] args) {
        inserir(5);
        inserir(8);
        inserir(4);
        inserir(1);
        inserir(3);

        exibir(raiz);

        maior(raiz);
        System.out.println("--- " + tempM.valor);
        menor(raiz);
        System.out.println("--- " + tempt);
    }
}
