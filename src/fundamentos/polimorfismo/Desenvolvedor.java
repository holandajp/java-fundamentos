package fundamentos.polimorfismo;

public class Desenvolvedor extends Funcionario{

    private double horasExtras;

    public Desenvolvedor(String nome, double salario, double horasExtras) {
        super(nome, salario);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salario + (horasExtras * 50);
    }
}
