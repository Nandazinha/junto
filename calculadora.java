import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double num1 = leia.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = leia.nextDouble();

        System.out.println("Selecione uma operação: 1. Soma 2. Subtração 3. Multiplicação 4. Divisão");
        int operação = leia.nextInt();

        double resultado;

        switch (operação) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;

            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;

            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;

            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
                
            default:
                System.out.println("Operação inválida.");
        }

    leia.close();
    
    }
}