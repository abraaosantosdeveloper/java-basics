package dio.cursodejava.primeirasemana;
public class Boletim {
    public static void main(String[] args) {
        int MEDIA_FINAL = 4;

        if (MEDIA_FINAL < 6) {
            System.out.println("Reprovado");

        } else if (MEDIA_FINAL >= 6 && MEDIA_FINAL < 7) {
            System.out.println("Passou com Média");

        } else {
            System.out.println("Aprovado");

        }
    };
}
