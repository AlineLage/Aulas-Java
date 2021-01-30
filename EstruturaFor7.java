/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.
 */
package estruturafor7;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ent = new Scanner (System.in);
        
        int num = ent.nextInt(), 
            quadrado, 
            cubo;
                
        for (int i = 1; i <= num; i++) {
            quadrado = (int) Math.pow(i, 2);
            cubo = (int) Math.pow(i, 3);
            System.out.printf("%d %d %d%n",i, quadrado, cubo);
        }
    }
    
}
