package com.br.matematica.circulo;

import java.util.Scanner;

public class Circulo {

    public static void main(String[] args) {
        //Entrada de dados
        double area;
        double perimetro;
        double raio;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Forneça o valor para o raio: ");
        raio = teclado.nextDouble();
        
        //Processamento de dados
        area = Math.PI * Math.pow(raio,2);
        perimetro = 2* Math.PI * raio;
        
        System.out.println("A área é: " + area);
        System.out.println("O perimetro é: " + perimetro );
        System.out.println("Fim do programa");
        
    }
}
