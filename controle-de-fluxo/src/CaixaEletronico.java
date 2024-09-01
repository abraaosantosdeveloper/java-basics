public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        double saldo = 59.50;
        double valorSaque = 11.99;

        if (valorSaque > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        } else if (valorSaque < saldo) {
            saldo = saldo - valorSaque;
            System.out.println("Saque realizado com sucesso. Saldo atual: " + saldo);

        }
    }
}
