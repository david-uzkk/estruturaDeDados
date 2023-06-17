package ex4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ex4AtivAval1 {
    public static String USER_DIR = System.getProperty("user.dir") + "\\src\\atividade5";
	public static String SEPARATOR = System.getProperty("file.separator");
    File file;

    public void lerArquivo(){
        try{
            FileReader leitor = new FileReader(USER_DIR + "\\David.txt");
            try (BufferedReader bfr = new BufferedReader(leitor)) {
                String tmp="";
                long[] n = new long[6];
                tmp = bfr.readLine();
                System.out.print(tmp);
                for(int i=0; i<3; i++){
                    n[i] = Long.parseLong(tmp);
                }
                n[3] = n[0];

                for(int i=1; i<4; i++){
                    System.out.print("\n" + n[i]);
                }

            }            
        }catch(Exception e){
           e.getMessage();
        }        
    }
    
    public static void main(String[] args) {
        ex4AtivAval1 c = new ex4AtivAval1();
        c.lerArquivo();

    }
}
