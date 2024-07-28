package dio.cursodejava.segundasemana;


public class ClasseNomeCompleto {

    public static void main(String[] args) {
        String nome = "Abraao";
        String sobrenome = "Santos";
        final String CPF = "709.595.704-54";

        String nomeCompleto = concatenarNomeCompleto(nome, sobrenome, CPF);
        System.out.println(nomeCompleto);
    }

    public static String concatenarNomeCompleto(String nome, String sobrenome, String CPF) {
        return "Nome de usuário:\t" + nome + " " + sobrenome + "\nCPF do usuário:\t\t" + CPF;
    
    }

} 