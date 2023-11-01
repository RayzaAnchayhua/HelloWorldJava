package com.br.kge.pancadaog;

import java.util.Scanner;

public class PancadaoG {

    public static void main(String[] args) {
       
        //Emtrada de dados
        int a;
        int b;
        int c;
        int d;
        int resultA;
        int resultB;
        int resultC;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o valor de A: ");
        a = teclado.nextInt();
        System.out.println("Insira o valor de B: ");
        b = teclado.nextInt();
        System.out.println("Insira o valor de C: ");
        c = teclado.nextInt();
        System.out.println("Insira o valor de D: ");
        d = teclado.nextInt();
        
        //Processamento de dados;
        resultA = (a+b) + (a+c) + (a+d)+ (a*b) + (a*c) + (a*d);
        resultB = (b+c)+(b+d)+(b*c)+(b*d);
        resultC = (c+d)+(c*d);
        
        //Saida de dados
        System.out.println("Este é a soma de todos os valores com A: "+ resultA );
        System.out.println("Este é a soma de todos os valores com B: "+ resultB );
        System.out.println("Este é a soma de todos os valores com C: "+ resultC );
        System.out.println("Fim do programa");
    }
}
