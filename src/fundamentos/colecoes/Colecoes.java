package fundamentos.colecoes;

import java.util.*;

public class Colecoes {

    public static void main(String[] args) {

        // 1. LIST - Ordenada

        List<String> nomes = new ArrayList<>();

        nomes.add("Pedro");
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro"); // aceita repetidos

        System.out.println("LIST:");
        System.out.println(nomes);

        // Perccorrendo com for-each
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        // 2. SET - Sem duplicados

        Set<String> emails = new HashSet<>();

        emails.add("a@email.com");
        emails.add("b@email.com");
        emails.add("a@email.com"); //ignorando

        System.out.println(("\nSET:"));
        System.out.println(emails);

        // Percorrendo Set
        for (String email : emails) {
            System.out.println("Email: " + email);
        }

        // 3. MAP - Chave -> Valor

        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Caneta", 10);
        estoque.put("Caderno", 5);
        estoque.put("Caneta", 20); //sobrescreve

        System.out.println("\nMap:");
        System.out.println("Caneta: " + estoque.get("Caneta"));
        System.out.println("Caderno:" + estoque.get("Caderno"));

        // Percorrendo Map
        for (String chave : estoque.keySet()) {
            System.out.println(chave + " = " + estoque.get(chave));
        }
    }
}