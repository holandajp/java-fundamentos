package fundamentos.heranca;

public class Gerente extends Funcionario{

    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario); // chama o construtor da classe pai
        this.bonus = bonus;
    }

    public void exibirBonus() {
        System.out.println("Bônus: " + bonus);
    }
}
