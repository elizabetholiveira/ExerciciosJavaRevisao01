import java.util.Random;
import java.util.Scanner;

public class ParOuImpar {

    // - Leia uma variável
    // - Se for par, some 5
    // - Se for ímpar, some 8
    // - Imprima o resultado

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Olá! Me diga um número! Se for par, somarei com 5! Se for ímpar, somarei com 8!");
        System.out.println("Você quer selecionar o número ou quer que seja aleatório?");
        System.out.println("(Responda com 1 para selecionar o número ou 2 para que seja aleatório!)");
        int selecao = resp.nextInt();

        int numero = 0;
        int soma = 0;

        if ((selecao == 1) || (selecao == 2)) {
            switch (selecao) {
                case 1:
                    System.out.println("Ok! Qual o número?");
                    numero = resp.nextInt();
                    break;
                case 2:
                    System.out.println("Ok! Me dê um minuto para eu selecionar o número...");
                    numero = aleatorio.nextInt(101);
            }

            System.out.println("O número selecionado é: " + numero);

            if (numero %2 == 0){
                soma = numero + 5;
                System.out.println("Esse número é par!");
            } if (numero %2 != 0){
                soma = numero + 8;
                System.out.println("Esse número é ímpar!");
            }

            System.out.println("Então, o resultado final é: " + soma);
            System.out.println("Tenha um bom dia!");
        } else {
            System.out.println("Seleção inválida!");
        }
    }
}
