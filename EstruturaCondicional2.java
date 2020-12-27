/*
 Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
package estruturacondicional2;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaCondicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner ent = new Scanner (System.in);
        
        System.out.println("Digite um número inteiro: ");
        num = ent.nextInt();
        
        if ((num%2) == 0) {
            System.out.println("O número digitado é par!");                       
        }
        else {
            System.out.println("O número digitado é ímpar!");
        }
                
    }
    
}
