/*
Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que 
serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo 
[10,20] e quantos estão fora do intervalo, mostrando essas informações conforme 
exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */
package estruturafor2;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ent = new Scanner(System.in);
        
        int n, x, in = 0, out = 0;
        
        System.out.println("Informe a quantidade de valores a serem lidos: ");
        n = ent.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número inteiro para análise: ");
            x = ent.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            }else{
                out++;
            }                
        }
        System.out.println("'in' para dentro do intervalo [10, 20] e 'out' para fora do intervalo:\n" + in + " in\n" + out + " out");
        
    }
    
}
