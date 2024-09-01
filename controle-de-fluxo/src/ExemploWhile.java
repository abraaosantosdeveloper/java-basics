import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50;
        DecimalFormat df = new DecimalFormat("#.00");
        while (mesada > 0) {

            double lanche = valorAleatorio();


            if(lanche > mesada)
            lanche = mesada;


            mesada -= lanche;

            System.out.println("Lanche: " + df.format(lanche) + ", Mesada: " + df.format(mesada));
            
        }
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
