import java.util.Scanner;

public class MediasDoAluno {

    // - Peça o número de identificação do aluno
    // - Pegar Nota 1
    // - Pegar Nota 2
    // - Pegar Nota 3
    // - ME (Média dos Exercícios) = (Nota 1 + Nota 2 + Nota 3) / 3
    // - MA (Média de Aproveitamento) = (nota 1 + (nota 2 * 2) + (nota 3 * 3) + ME) / 7
    // - Se conceito(MA) A (>= 90), B (>= 75 e <90) ou C (>= 60 e < 75) = Aprovado
    // - Se conceito(MA) D (>= 40 e <60) ou E (<40) = Reprovado
    // - Mostrar:
    //      - Número do aluno
    //      - Notas do aluno
    //      - Média dos Exercícios
    //      - Média de Aproveitamento
    //      - Conceito
    //      - Aprovado ou Reprovado

    public static void main(String[] args) {

        Scanner respostas = new Scanner(System.in);

        System.out.println("Olá, aluno! Final de ano chegando né?");
        System.out.println("Você já fez as provas finais e agora está nervoso sem saber como calcular se passou ou não?");
        System.out.println("Não se preocupe! Eu te ajudo nisso! Por favor, preencha as informações abaixo:");

        System.out.println("Primeiro: Qual o seu número de identificação?");
        int identificacao = respostas.nextInt();

        System.out.println("Ok! Agora me diga suas notas:");

        System.out.println("Qual é a primeira nota?");
        int nota1 = respostas.nextInt();

        System.out.println("Qual é a segunda nota?");
        int nota2 = respostas.nextInt();

        System.out.println("Qual é a terceira nota?");
        int nota3 = respostas.nextInt();

        System.out.println("Ok! Só um minuto que vou calcular aqui para você!");

        System.out.println();
        System.out.println("Calculando...");
        System.out.println();

        int me = (nota1 + nota2 + nota3) / 3;
        int ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me) / 7;
        char conceito = 'F';
        String aprovacao = "status";

        if (ma >= 60){
            aprovacao = "Aprovado";
            if (ma >= 90){
                conceito = 'A';
            }if ((ma >= 75) && (ma < 90)){
                conceito = 'B';
            }if ((ma >= 60) && (ma < 75)){
                conceito = 'C';
            }
        }if (ma < 60){
            aprovacao = "Reprovado";
            if ((ma >= 40) && (ma <60)){
                conceito = 'D';
            }if (ma < 40){
                conceito = 'E';
            }
        }

        System.out.println("Esses são os seus dados e os resultados!");
        System.out.println("Identificação: " + identificacao);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média dos Exercícios (ME): " + me);
        System.out.println("Média de Aproveitamento (MA): " + ma);
        System.out.println("Conceito: " + conceito);
        System.out.println("Resultado final: " + aprovacao);

        if (aprovacao == "Aprovado"){
            System.out.println("Parabéns! Você se saiu muito bem!");
        }if (aprovacao == "Reprovado"){
            System.out.println("Infelizmente não foi dessa vez! Quem sabe no próximo ano?");
        }

        System.out.println();
        System.out.println("Tenha um bom dia!");
    }
}
