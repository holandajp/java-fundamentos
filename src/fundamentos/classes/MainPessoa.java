package fundamentos.classes;

public class MainPessoa {

    public static void main(String[] args) {

        // Criando objetos
        Pessoa p1 = new Pessoa();
        p1.nome = "João";
        p1.idade = 22;

        Pessoa p2 = new Pessoa();
        p2.nome = "Maria";
        p2.idade = 30;

        // Chamando métodos
        p1.apresentar();
        p2.apresentar();
    }
}
