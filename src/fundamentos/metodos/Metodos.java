package fundamentos.metodos;

public class Metodos {

    public static void main(String[] args) {

        // Chamando métodos
        saudacao();
        mostrarSoma(10,5);

        int resultado = somar(7,3);
        System.out.println("Resultado da soma: " + resultado);

        System.out.println("Dobro: " + dobro(4));
    }

    // 1. Metodo sem retorno e sem parâmetro
    static void saudacao() {
        System.out.println("Olá! Bem-vindo ao Java.");
    }

    // 2. Metodo sem retorno e com parametros
    static void mostrarSoma(int a, int b) {
        System.out.println("Soma: " + (a + b));
    }

    // 3. Metodo com retorno
    static int somar(int a, int b) {
        return a + b;
    }

    // 4. Metodo com retorno
    static int dobro(int numero) {
        return numero * 2;
    }
}
