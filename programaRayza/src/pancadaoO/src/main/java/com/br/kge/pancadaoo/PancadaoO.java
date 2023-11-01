package com.br.kge.pancadaoo;

import java.util.Scanner;

public class PancadaoO {

    public static void main(String[] args) {
        //Entrada de dados
        Scanner teclado = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        int varP;
        int varS;
        
        System.out.println("Forneça o valor para A: ");
        a = teclado.nextInt();
        System.out.println("Forneça o valor para B: ");
        b = teclado.nextInt();
        System.out.println("Forneça o valor para C: ");
        c = teclado.nextInt();
        System.out.println("Forneça o valor para D: ");
        d = teclado.nextInt();
        
        //Processamento de dados
        varP = a*c;
        varS = b+d;
        
        //Saida de dados
        System.out.println("O resultado de AxC: "+varP);
        System.out.println("O resultado de B+D: "+varS);
        System.out.println("Fim do programa");
        
               
    }
}
