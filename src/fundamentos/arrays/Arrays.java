package fundamentos.arrays;

public class Arrays {
    public static void main(String[] args) {

        // 1. DECLARAÇÃO E INICIALIZAÇÃO
        int[] numeros = new int[5]; // tamanho fixo

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // 2. ACESSO AOS ELEMENTOS
        System.out.println("Primeiro elemento: " + numeros[0]);
        System.out.println("Último elemento: " + numeros[4]);

        // 3. TAMANHO DO ARRAY
        System.out.println("Tamanho do array: " + numeros.length);

        // 4. PERCORRENDO COM FOR
        System.out.println("\nPercorrendo com for:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // 5. FOR-EACH
        System.out.println("\nPercorrendo com for-each:");

        for (int numero : numeros) {
            System.out.println(numero);
        }

        // 6. ARRAY DE STRINGS
        String[] nomes = {"Ana", "João", "Maria", "Pedro"};

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // 7. SOMA DOS ELEMENTOS
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("Soma: " + soma);
    }
}
