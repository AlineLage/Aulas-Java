/*

 */
package exercício.pkg1;
import  java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
       
        double raio, area;
        
        System.out.println("Informe o raio de um círculo: ");
                raio=entrada.nextDouble();
                
                area=3.14159*Math.pow(raio,2);
                
        System.out.printf("A área desse círculo é: %.2f"+area);
    }
    
}
