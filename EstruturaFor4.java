/*
 Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
package estruturafor4;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaFor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double  par1 = 0, par2 = 0, div = 0;
        int     n;
        
        System.out.println("Digite a quantidade de entrada de números: ");
        n = entrada.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o primeiro número: ");
            par1 = entrada.nextDouble();
            
            System.out.println("Digite o segundo número: ");
            par2 = entrada.nextDouble();
            
            div = par1 / par2;
            
            if (par2 == 0) {
            System.out.println("Divisão impossível: ");
        }else{
            System.out.println(par1 + " / " + par2 + " = " + div);
        }                        
            }
        
    }
    
}
