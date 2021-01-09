/*
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.
 */
package estruturawhile1;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int senha = 2002;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a senha: ");
        senha = entrada.nextInt();
        
        while (senha != 2002){
            System.out.println("Senha Inválida!");
            System.out.println("Digite a senha: ");
            senha = entrada.nextInt();
        }
        System.out.println("Acesso permitido!");
    }
    
}
