import java.util.*;

public class ReajusteDeSalario {

    // - Ler um conjunto de salários
    // - Terminar quando digitar -1
    // - Ler o valor do reajuste
    // - Exiba os salários reajustados

    public static void main(String[] args) {

        Scanner resp = new Scanner(System.in);

        int funcionario = 0;
        List<Integer> funcionarios = new ArrayList<>();
        double salario = 0;
        List<Double> salarios = new ArrayList<>();

        System.out.println("Olá! Vou calcular o reajuste do salário dos seus funcionários!");

        int u = 3;
        for (int i = 1; i < u; i++ ) {
                System.out.println("Você deseja adicionar um funcionário? (digite 0 para sim e -1 para não)");
                i = resp.nextInt();

            if ((i > 0) || (i < -1)){
                System.out.println("Opa! Algo deu errado! Tente de novo!");
                i = 1;
            }if (i == 0) {
                    u++;

                    System.out.println("Qual o número do funcionário?");
                    funcionario = resp.nextInt();
                    funcionarios.add(funcionario);

                    System.out.println("Qual o salário do funcionário?");
                    salario = resp.nextDouble();
                    salarios.add(salario);
                } if (i == -1) {
                i = u + 1;
                }
            }


        System.out.println("Certo! Qual a porcentagem do reajuste? (aumento)");
        double reajuste = resp.nextDouble();

        System.out.println();
        System.out.println("Calculando...");
        System.out.println();

        double bonus = 0;
        List<Double> reajustes = new ArrayList<>();

        for (int k = 0; k < funcionarios.size(); k++){
            bonus = (salarios.get(k) * reajuste) / 100;
            reajustes.add(bonus + salarios.get(k));
        }

        System.out.println("Esses são os salários de cada funcionário após o reajuste:");

        for (int m = 0; m < funcionarios.size(); m++){
            System.out.printf("Funcionário: " + funcionarios.get(m) + " | Salário reajustado: R$ %,.2f%n", reajustes.get(m));
        }

        System.out.println("Tenha um bom dia!");
    }
}
