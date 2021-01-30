/*
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
 */
package estruturafor3;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n, peso1 = 2, peso2 = 3, peso3 = 5;
        double teste1 = 0, teste2 = 0, teste3 = 0, mediaPonderada = 0;
        
        System.out.println("Quantos testes serão feitos? ");
        n = entrada.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Teste " + (i+1));            
            System.out.println("Informe o valor do primeiro teste: ");
            teste1 = entrada.nextDouble();
            System.out.println("Informe o valor do segundo teste: ");
            teste2 = entrada.nextDouble();
            System.out.println("Informe o valor do terceiro teste: ");
            teste3 = entrada.nextDouble();
            
            mediaPonderada = (peso1 * teste1 + peso2 * teste2 + peso3 * teste3) / (peso1 + peso2 + peso3);
            
            System.out.println();
            System.out.printf("Média ponderada do teste %d: %.1f%n%n", (i+1), mediaPonderada);
        }        
        
        
    }
    
}
