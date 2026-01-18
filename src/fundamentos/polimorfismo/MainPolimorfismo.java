package fundamentos.polimorfismo;

public class MainPolimorfismo {

    public static void main(String[] args) {

        Funcionario f1 = new Gerente("Ana", 8000, 2000);
        Funcionario f2 = new Desenvolvedor("João", 6000, 10);

        System.out.println(f1.calcularSalario());
        System.out.println(f2.calcularSalario());
    }
}
