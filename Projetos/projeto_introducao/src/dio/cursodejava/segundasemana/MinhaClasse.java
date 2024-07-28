package dio.cursodejava.segundasemana;

public class MinhaClasse {
    public static void main(String[] args) {

        // Variáveis não podem começar com caracteres especiais além de _ ou $, tampouco
        // números.
        // Não pode começar ou conter caracteres epeciais.

        // Inteiro
        int idade = 20;

        // Double (Decimais)
        double salario = 1234.56;

        // Caractere
        char letra = 'A';

        // Booleano(True/False)
        boolean verdadeiro = true;

        // String (Texto)
        String frase = "Olá, mundo!";

        // Constante (Valor fixo)
        final String NOME = "Abraão Santos";

        // Variável com nome composto
        String profissao = "Desenvolvedor Java";

        System.out.print(frase + " Eu sou " + NOME + ", e tenho "
                + idade + " anos. \nTrabalho como " + profissao
                + ". Meu salário inicial foi de " + salario + ".\nA inicial do meu nome é: " + letra);

    }
}
