/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar:

Código      Especificação       Preço
1           Cachorro Quente     R$ 4,00
2           X-Salada            R$ 4,50
3           X-Bacon             R$ 5,00
4           Torrada Simples     R$ 2,00
5           Refrigerante        R$ 1,50
 */
package estruturacondicional5;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaCondicional5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double item,
               quantidade,
               total,
               cachorroQuente = 4,
               xSalada = 4.50,
               xBacon = 5,
               torradaSimples = 2,
               refrigerante = 1.5;
        
        Scanner ent = new Scanner (System.in);
        
        System.out.println("Qual o item desejado?");
        item = ent.nextInt();
        
        System.out.println("Qual a quantidade desejada?");
        quantidade = ent.nextInt();
        
        if (item == 1) {
            item = cachorroQuente;
        }else if (item == 2) {
            item = xSalada;            
        }else if (item == 3) {
            item = xBacon;
        }else if (item == 4) {
            item = torradaSimples;
        }else if (item == 5) {
            item = refrigerante;  
        }
        total = item * quantidade;
        System.out.printf("O valor total é %.2f%n", total);
    }
    
}
