import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entre0e100 {

    public static void main(String[] args) {

        Scanner resposta = new Scanner(System.in);

        System.out.println("Olá! Você vai me dizer 20 números e ao final eu direi quais estão entre 0 e 100!");

        List<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++){
            System.out.println("Me diga o " + i + "º número:");
            numeros.add(resposta.nextInt());
        }

        System.out.println("Dentre os números que você digitou, os que estão entre 0 e 100 são:");
        for (int i = 0; i < numeros.size(); i++){
            if ((numeros.get(i) > 0) && (numeros.get(i) < 100)){
                System.out.println(numeros.get(i));
            }
        }

        System.out.println("Tenha um bom dia!");
    }
}
