package fundamentos.construtores;

public class MainProduto {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto("Caneta", 2.50);
        Produto p3 = new Produto("Caderno", 15.0, 10);

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}
