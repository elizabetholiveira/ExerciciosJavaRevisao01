import java.util.Scanner;

public class MediaDeIdades {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        System.out.println("Olá! Aqui você vai me dizer a idade de 20 pessoas e eu direi a média das idades!");

        double soma = 0;

        for (int i = 1; i <= 20; i++){
            System.out.println("Qual a idade da " + i + "ª pessoa?");
            int idade = resposta.nextInt();
            soma = soma + idade;
        }

        double media = soma / 20;

        System.out.println("Certo! A média das idades é: " + media);

        System.out.println("Tenha um bom dia!");
    }
}
