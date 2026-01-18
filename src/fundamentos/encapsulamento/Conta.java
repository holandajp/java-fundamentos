package fundamentos.encapsulamento;

public class Conta {

    // dados protegidos
    private double saldo;

    // construtor
    public Conta(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        }
    }

    // getter (só leitura)
    public double getSaldo() {
        return saldo;
    }

    // comportamento (regra)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // comportamento (regra)
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }
}
