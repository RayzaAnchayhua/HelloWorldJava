package com.br.kge.pancadaoj;

import java.util.Scanner;

public class PancadaoJ {

    public static void main(String[] args) {
        
        //Entrada de dados
        int a;
        int b;
        double result;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Forneça o valor de A: ");
        a = teclado.nextInt();
        System.out.println("Forneça o valor de B: ");
        b = teclado.nextInt();
        
        //Processamento de dados
        result = (a-b)*(a-b);
        
        //Saida de dados
        System.out.println("Este é o resultado do quadrado da diferença entre A e B: "+result);
        System.out.println("Fim do programa");
        
        
    }
}
