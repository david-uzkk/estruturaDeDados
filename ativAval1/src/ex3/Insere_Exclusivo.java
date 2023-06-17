package ex3;

import java.util.Random;

public class Insere_Exclusivo {
    public void InsereExclusivo() {
        int numero;
        int n = 10;
        int[] vet = new int[6];
        Random random = new Random();

        for(int i=0; i<vet.length; i++){
             numero = random.nextInt(n) + 1;
             for(int j=0; j<vet.length; j++){
                   if(numero == vet[j] && j != i){
                         numero = random.nextInt(n) + 1;
                   }else{
                        vet[i] = numero;
                   }
             }
        }

        for(int i=0; i<vet.length; i++){
             System.out.print(vet[i]+"  ");
        }
    }

    public static void main(String[] args) {
        Insere_Exclusivo c = new Insere_Exclusivo();
        c.InsereExclusivo();
    }
}
