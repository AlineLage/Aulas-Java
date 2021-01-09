/*
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).
 */
package estruturawhile2;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double x, y;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Insira um valor para a coordenada X: ");
        x = entrada.nextDouble();
        
        System.out.println("Insira um valor para a coordenada Y: ");
        y = entrada.nextDouble();
        
        while (x != 0 && y != 0){
            if (x > 0 && y > 0) {
                System.out.println("Primeiro Quadrante.");                
            }else if (x < 0 && y > 0) {
                System.out.println("Segundo Quadrante.");
            }else if (x < 0 && y < 0) {
                System.out.println("Terceiro Quadrante.");
            }else{
                System.out.println("Quarto Quadrante.");
            }
            System.out.println("Insira um valor para a coordenada X: ");
            x = entrada.nextDouble();
        
            System.out.println("Insira um valor para a coordenada Y: ");
            y = entrada.nextDouble();
        }
    }
    
}
