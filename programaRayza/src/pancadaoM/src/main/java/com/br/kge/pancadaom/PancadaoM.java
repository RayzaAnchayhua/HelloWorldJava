package com.br.kge.pancadaom;

import java.util.Scanner;

public class PancadaoM {

    public static void main(String[] args) {
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        double resultado;
        
        System.out.println("Informe o valor de A: ");
        a = teclado.nextInt();
        System.out.println("Informe o valor de B: ");
        b = teclado.nextInt();
        System.out.println("Informe o valor de C: ");
        c = teclado.nextInt();
        
        //Processamento de dados
        resultado = Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2);
        
        //Saida de dados
        System.out.println("Este é o resultado: "+ resultado);
        System.out.println("Fim do programa");
        
    }
}
