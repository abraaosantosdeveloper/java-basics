package dio.cursodejava.segundasemana;


public class ClasseNomeCompleto {

    public static void main(String[] args) {
        String nome = "Abraao";
        String sobrenome = "Santos";
        String nomeCompleto = concatenarNomes(nome, sobrenome);
        String nomeCompleto2 = concatenarNomes2(nome, sobrenome);

        System.out.println(nomeCompleto);
        System.out.println(nomeCompleto2);
    }
    public static String concatenarNomes(String nome, String sobrenome){
        return "Resultado do método: " + nome + " " + sobrenome;
    }
    public static String concatenarNomes2(String nome, String sobrenome){
        return "Resultado do método utilizando Concat(): " + nome.concat(" ").concat(sobrenome);
    }
}
