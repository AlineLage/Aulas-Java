/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
package estruturacondicional1;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaCondicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe um número inteiro: ");
        numero = entrada.nextInt();
        
        if (numero < 0) {
            System.out.println("O número informado é negativo! ");
        }
        else {
            System.out.println("O número informado não é negativo! ");                        
                    }                        
    }
}