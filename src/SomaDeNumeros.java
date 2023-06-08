import java.util.Scanner;

public class SomaDeNumeros {

    // - Ler uma sequência de números do usuário
    // - Somar esses números
    // - Parar se o usuário digitar um número negativo

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        System.out.println("Olá! Aqui você pode dizer quantos números você quiser que eu irei somá-los!");
        System.out.println("Se quiser parar é só digitar algum número negativo.");

        int u = 2;
        double soma = 0;

        for (int i = 1; i < u; i++){
            System.out.println("Qual é o " + i + "º número?");
            double numero = resposta.nextDouble();
            if (numero >= 0){
                soma = soma + numero;
                u++;
            }if (numero < 0){
                u = -1;
                System.out.println("Fim dos números!");
                System.out.println("A soma final é: " + soma);
            }
        }

        System.out.println("Tenha um bom dia!");
    }
}
