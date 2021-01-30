/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
package estruturafor5;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int n, fat;
        
        System.out.println("Informe o número desejado: ");
        n = entrada.nextInt();
        
        fat = 1;
	for (int i=1; i<=n; i++) {
            fat = fat * i;
	}
        
        System.out.println("O fatorial desse número é: " + fat);
    }
    
}
