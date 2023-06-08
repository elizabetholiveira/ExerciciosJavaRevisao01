public class Vetor50Numeros {

    // - Criar um vetor que armazene 50 números inteiros
    // - Preencha automaticamente com os números de 101 a 150
    // - Exiba os valores do vetor

    public static void main(String[] args) {

        int[] numeros = new int[50];

        int inicio = 101;
        for (int i = 0; i < 50; i++){
            numeros[i] = inicio;
            inicio++;
        }

        System.out.println("Oi! Eu anotei 50 números aqui! Quer ver? Olha só!");

        for (int i = 0; i < 50; i++){
            System.out.println((i + 1) + "º número = " + numeros[i]);
        }

        System.out.println("Legal, né?");
    }
}
