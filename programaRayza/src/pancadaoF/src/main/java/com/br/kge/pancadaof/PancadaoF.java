package com.br.kge.pancadaof;

import java.util.Scanner;

public class PancadaoF {

    public static void main(String[] args) {
        //Entrada de dados
        double a;
        double b;
        double r; //Era isso que faltava no meu programa
 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o valor de A: ");
        a = teclado.nextDouble();
        System.out.println("Insira o valor de B: ");
        b = teclado.nextDouble();
       
        //Processamento de dados
        r = a ;
        a = b;
        b = r;
             
        //Saída de dados
        System.out.println("Este é o valor de A: " + a );
        System.out.println("Este é o valor de B: " + b);
        System.out.println("Fim do programa");
        
    }
}
