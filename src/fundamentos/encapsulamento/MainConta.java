package fundamentos.encapsulamento;

public class MainConta {

    public static void main(String[] args) {

        Conta conta = new Conta(100);

        conta.depositar(50);
        conta.sacar(30);

        System.out.println("Saldo atual: " + conta.getSaldo());

        conta.sacar(1000); // não deixa
        System.out.println("Saldo final: " + conta.getSaldo());
    }
}
