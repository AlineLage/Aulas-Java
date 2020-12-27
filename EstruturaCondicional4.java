/*
 Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
 */
package estruturacondicional4;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaCondicional4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int horaInicial, horaFinal, duracao;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe a hora em que o jogo começou: ");
        horaInicial = entrada.nextInt();
        
        System.out.println("Informe a hora em que o jogo terminou: ");
        horaFinal = entrada.nextInt();
        
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else{
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou "+duracao+" hora(s)");
    }
    
}
