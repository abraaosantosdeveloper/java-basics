import java.util.Scanner;

// Classe que representa um resultado escolar de um aluno
public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner scDouble = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = sc1.nextLine();
        System.out.println("Digite a primeira nota: ");
        double nota1 = scDouble.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = scDouble.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media < 7) {
            String status = "Reprovado";
            System.out.println("O aluno " + nomeAluno + "obteve média " + media + "e portanto está " + status + ".");
        } else {
            String status = "Aprovado";
            System.out.println("O aluno " + nomeAluno + " obteve média " + media + " e portanto está " + status + ".");
        }
    }
}
