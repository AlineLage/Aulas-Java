/*
 Ler um número inteiro N e calcular todos os seus divisores.
 */
package estruturafor6;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int num;
        
        System.out.println("Informe um número inteiro: ");
        num = entrada.nextInt();
  
        System.out.println();
        System.out.println("Os divisores desse número são: ");
        
        for (int i = 1; i <= num; i++) {
            if (num%i == 0) {
                System.out.println(i);
            }            
        }        
    }
    
}
