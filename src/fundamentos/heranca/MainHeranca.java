package fundamentos.heranca;

public class MainHeranca {

    public static void main(String[] args) {

        Gerente g = new Gerente("Ana", 8000, 2000);
        Desenvolvedor d = new Desenvolvedor("João", 6000, "Java");

        g.exibirDados();     // herdado
        g.exibirBonus();     // próprio

        System.out.println();

        d.exibirDados();     // herdado
        d.exibirLinguagem(); // próprio
    }
}