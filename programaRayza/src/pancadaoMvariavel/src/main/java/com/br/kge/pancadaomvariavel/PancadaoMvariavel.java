package com.br.kge.pancadaomvariavel;

import java.util.Scanner;

public class PancadaoMvariavel {

    public static void main(String[] args) {
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        double a;
        double b;
        double c;
        double result;
        
        System.out.println("Forneça um valor para A: ");
        a = teclado.nextDouble();
        System.out.println("Forneça um valor para B: ");
        b = teclado.nextDouble();
        System.out.println("Forneça um valor para C: ");
        c = teclado.nextDouble();
        
        //Processamento de dados
        result = Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)+2*(a*b+a*c+b*c);
        
        System.out.println("Esta é a soma dos quadrados: "+result);
        System.out.println("Fim do programa");
    }
}
