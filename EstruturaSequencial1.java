/*
Exercícios de Estrutura Sequencial do curso de Java.
 */
package estruturasequencial1;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class EstruturaSequencial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Faça um programa para ler dois valores inteiros, e depois mostrar na 
        tela a soma desses números com uma mensagem explicativa*/
        
        int x, y, soma;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número inteiro: ");
        x = entrada.nextInt();
        
        System.out.println("Digite o segundo número inteiro: ");
        y = entrada.nextInt();
        
        soma = x + y;
        
        System.out.println("A soma entre " + x + " e " + y + " é: " + soma);
                
        /* Faça um programa para ler o valor do raio de um círculo, e depois mostrar
        o valor da área deste círculo com quatro casas decimais conforme exemplos.
        Fórmula da área: area = π . raio2
        Considere o valor de π = 3.14159*/
        
        double area, raio, pi = 3.14159;
        
        System.out.println();
        
        System.out.println("Digite o raio do círculo em que se deseja calcular a área: ");
        raio = entrada.nextDouble();
        
        area = Math.pow(raio, 2) * pi;
        
        System.out.printf("A área desse círculo é: %.4f%n", area);
        
        /* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
        calcule e mostre a diferença do produto de A e B pelo produto de C e D 
        segundo a fórmula: DIFERENCA = (A * B - C * D).*/
        
        int a, b, c, d, diferenca;
        
        System.out.println();
        
        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();
        System.out.println("Informe o valor de C: ");
        c = entrada.nextInt();
        System.out.println("Informe o valor de D: ");
        d = entrada.nextInt();
        
        diferenca = (a * b - c * d);
        
        System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);
        
        /* Fazer um programa que leia o número de um funcionário, seu número de 
        horas trabalhadas, o valor que recebe por hora e calcula o salário desse 
        funcionário. A seguir, mostre o número e o salário do funcionário, com duas
        casas decimais.*/
        
        int matricula;
        double nHorasTrab, 
               valorHora, 
               salario;
        
        System.out.println();
        
        System.out.println("Informe a matrícula dx funcionárix: ");
        matricula = entrada.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas por essx funcionárix: ");
        nHorasTrab = entrada.nextDouble();
        System.out.println("Informe o valor recebido por hora para essx funcionárix: ");
        valorHora = entrada.nextDouble();
        
        salario = nHorasTrab * valorHora;
        
        System.out.printf("Funcionárix de número %d irá receber o salário no valor de: %.2f\n", matricula, salario);
        
        /* Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
        o valor unitário de cada peça 1, o código de uma peça 2, o número de peças
        2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/
        
        int cod1, cod2, num1, num2;
        double valor1, valor2, total;
        
        System.out.println();
        
        System.out.println ("Informe o código da peça 1: ");
        cod1 = entrada.nextInt();
        
        System.out.println ("Informe a quantidade da peça 1: ");
        num1 = entrada.nextInt();
        
        System.out.println ("Informe o valor da peça 1: ");
        valor1 = entrada.nextDouble();
        
        System.out.println ("Informe o código da peça 2: ");
        cod2 = entrada.nextInt();
        
        System.out.println ("Informe a quantidade da peça 2: ");
        num2 = entrada.nextInt();
        
        System.out.println ("Informe o valor da peça 2: ");
        valor2 = entrada.nextDouble();
        
        total = num1 * valor1 + num2 * valor2;
        
        System.out.println("O valor total a ser pago é: " + total);
        
        /*Fazer um programa que leia três valores com ponto flutuante de dupla 
        precisão: A, B e C. Em seguida, calcule e mostre:
        a) a área do triângulo retângulo que tem A por base e C por altura.
        b) a área do círculo de raio C. (pi = 3.14159)
        c) a área do trapézio que tem A e B por bases e C por altura.
        d) a área do quadrado que tem lado B.
        e) a área do retângulo que tem lados A e B.*/
        
        double valorA, valorB, valorC, triangulo, circulo, trapezio, quadrado, retangulo, pI;
        
        System.out.println();
        
        System.out.println("Informe o valor de A:");
        valorA = entrada.nextDouble();
        
        System.out.println("Informe o valor de B:");
        valorB = entrada.nextDouble();
        
        System.out.println("Informe o valor de C:");
        valorC = entrada.nextDouble();
                
        triangulo = (valorA * valorC) / 2;
        circulo = pi * Math.pow(valorC, 2);
        trapezio = ((valorA + valorB) * valorC) / 2;
        quadrado = Math.pow(valorB, 2);
        retangulo = valorA * valorB;
        
        System.out.printf("As áreas calculadas são: %nTriângulo: %.2f%nCírculo: %.2f%nTrapézio: %.2f%nQuadrado: %.2f%nRetangulo: %.2f%n", triangulo, circulo, trapezio, quadrado, retangulo);
        
        
    }
    
}
