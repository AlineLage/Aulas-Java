/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.
 */
package estruturawhile3;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero, alcool = 0, gasolina = 0, diesel = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Informe o combustível abastecido (1.Álcool 2.Gasolina 3.Diesel 4.Fim): ");
        numero = entrada.nextInt();
        
        while(numero != 4){
            switch (numero) {
                case 1:
                    alcool += 1;
                    break;
                case 2:
                    gasolina += 1;
                    break;
                case 3:
                    diesel += 1;
                    break;
                default:
                    System.out.println("Código Inválido (Digite os seguintes códigos: 1.Álcool 2.Gasolina 3.Diesel 4.Fim): ");
                    numero = entrada.nextInt();
                    break;            
            }
            System.out.println("Informe o combustível abastecido (1.Álcool 2.Gasolina 3.Diesel 4.Fim): ");
            numero = entrada.nextInt();
        }
        System.out.printf("MUITO OBRIGADA!%nAlcool %d%nGasolina %d%nDiesel %d%n", alcool, gasolina, diesel);
    }
    
}
