import java.util.Scanner;

public class UsuarioNVezes {

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        System.out.println("Olá! Eu vou repetir o seu nome quantas vezes você quiser!");

        System.out.println("Qual é o seu nome?");
        String nome = resp.nextLine();

        System.out.println("Quantas vezes você quer que eu repita ele?");
        int N = resp.nextInt();

        System.out.println("Ok!");

        int i = 0;
        while (i < N){
            System.out.println(nome);
            i++;
        }

        System.out.println("Tenha um bom dia!");
    }
}
