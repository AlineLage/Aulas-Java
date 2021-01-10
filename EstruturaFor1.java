/*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até 
X, um valor por linha, inclusive o X, se for o caso.
 */
package estruturafor1;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int x;
        
        System.out.println("Informe um valor inteiro entre 1 e 1000: ");
        x = entrada.nextInt();
        
        for (int i = 1; i <= x; i += 2) {
            System.out.println(i);                        
        }
    }
    
}
