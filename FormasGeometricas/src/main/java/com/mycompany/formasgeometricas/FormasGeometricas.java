/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formasgeometricas;

/**
 *
 * @author kesia.viana
 */
public class FormasGeometricas {
    
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];

        formas[0] = new Circulo(5);          // Círculo com raio 5
        formas[1] = new Retangulo(4, 6);     // Retângulo com largura 4 e altura 6
        formas[2] = new Triangulo(3, 4);      // Triângulo com base 3 e altura 4

        // Exibindo a área de cada forma
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}

