/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismo;

/**
 *
 * @author kesia.viana
 */
 import java.util.ArrayList;
import java.util.List;

public class Polimorfismo {

    public static void main(String[] args) {
        List<Livro> listaLivros = new ArrayList<>();

        // Adicionando objetos da classe Livro
        listaLivros.add(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 39.90));
        listaLivros.add(new Livro("1984", "George Orwell", 29.90));

        // Adicionando objetos da classe Ebook
        listaLivros.add(new Ebook("Dom Casmurro", "Machado de Assis", 19.90, 1.5));
        listaLivros.add(new Ebook("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 24.90, 2.0));

        // Exibindo detalhes de todos os livros
        for (Livro livro : listaLivros) {
            livro.exibirDetalhes();
            System.out.println(); // Para uma melhor formatação
        }
    }
}


