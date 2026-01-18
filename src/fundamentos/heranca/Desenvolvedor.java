package fundamentos.heranca;

public class Desenvolvedor extends Funcionario {

    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    public void exibirLinguagem() {
        System.out.println("Linguagem: " + linguagem);
    }
}
