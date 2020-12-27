/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.
 */
package estruturacondicional3;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaCondicional3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numA, numB;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número inteiro: ");
        numA = entrada.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        numB = entrada.nextInt();
        
        if (numA%numB == 0 || numB%numA == 0) {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }
        
    }
    
}
