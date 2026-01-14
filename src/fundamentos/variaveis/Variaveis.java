package fundamentos.variaveis;

public class Variaveis {

    public static void main(String[] args) {
        //1. TIPOS PRIMITIVOS

        byte idadeByte= 20; //números pequenos
        short ano = 2025; //números médios
        int idade = 23; //números inteiros (mais usado)
        long populacao = 8000000000L; //números grandes

        float altura = 1.75f; //números decimais (menos preciso)
        double peso = 72.5; //números decimais (mais preciso)

        char letra = 'J'; //um único caractere
        boolean ativo = true; //verdadeiro ou falso

        //2. STRING (tipo referência)

        String nome = "João Pedro";

        //3. EXIBINDO NO CONSOLE
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Letra: " + letra);
        System.out.println("Ativo: " + ativo);

        //4. OPERAÇÕES COM VARIÁVEIS

        int a = 10;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double divisao = (double) a / b;   // casting

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        //5. CONCATENAÇÃO
        String mensagem = "Olá, " + nome + "! Você tem " + idade + " anos.";
        System.out.println(mensagem);

        //6. VARIÁVEIS CONSTANTES

        final double PI = 3.14159;
        double raio = 5;
        double area = PI * raio * raio;

        System.out.println("Área do círculo: " + area);

        //7. ATUALIZAÇÃO DE VARIÁVEIS
        int contador = 0;
        contador = contador + 1;
        contador++;
        contador += 5;

        System.out.println("Contador: " + contador);

    }

}
