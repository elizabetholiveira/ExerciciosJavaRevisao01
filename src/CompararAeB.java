import java.util.Random;
import java.util.Scanner;

public class CompararAeB {

    // - Leia dois valores inteiros: A e B
    // - Se A = B, então some
    // - Se A =/= B, então multiplique
    // - Escrever o resultado em C e mostrar

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Olá! Eu comparo dois números e se eles forem iguais eu os somo! Porém se eles forem diferentes" +
                " eu os multiplico! Quer ver?");

        System.out.println("Primeiro selecione se você quer decidir os números ou se quer que sejam aleatórios! (digite o número)");
        System.out.println("1 - Quero decidir!");
        System.out.println("2 - Quero que seja aleatório!");
        int selecao = resp.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;

        if ((selecao == 1) || (selecao == 2)) {
            switch (selecao) {
                case 1:
                    System.out.println("Ok! Qual o valor A?");
                    A = resp.nextInt();
                    System.out.println("Legal! E qual o valor B?");
                    B = resp.nextInt();
                    System.out.println("Entendi! A é " + A + " e B é " + B);
                    break;
                case 2:
                    System.out.println("Ok! Aleatorizando números...");
                    A = aleatorio.nextInt(101);
                    B = aleatorio.nextInt(101);
                    System.out.println("Defini que A é " + A + " e B é " + B);
                    break;
            }

            System.out.println();
            System.out.println("----------");
            System.out.println("Calculando...");
            System.out.println("----------");
            System.out.println();

            if (A == B) {
                C = A + B;
                System.out.println("Os números são iguais! Então eu somei! (A + B = C)");
            }
            if (A != B) {
                C = A * B;
                System.out.println("Os números são diferentes! Então eu multipliquei! (A * B = C)");
            }

            System.out.println("Resultado final:");
            System.out.println("A = " + A);
            System.out.println("B = " + B);
            System.out.println("C = " + C);

            System.out.println("Tenha um bom dia!");
        }

        if ((selecao != 1) && (selecao != 2)) {
            System.out.println("Número inválido!");
        }
    }
}
