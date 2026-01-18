package fundamentos.construtores;

public class Produto {

    String nome;
    double preco;
    int quantidade;

    // Construtor vazio
    public Produto() {
        this("Sem nome", 0.0, 0);
    }

    // Construtor com nome e preço
    public Produto(String nome, double preco) {
        this(nome, preco, 0);
    }

    // Construtor completo
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Metodo só pra exibir os dados
    void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("----------------------");
    }
}
