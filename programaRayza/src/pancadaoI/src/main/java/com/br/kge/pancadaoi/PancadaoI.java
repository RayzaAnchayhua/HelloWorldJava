package com.br.kge.pancadaoi;

import java.util.Scanner;

public class PancadaoI {

    public static void main(String[] args) {
        
        //Entrada de dados
        int inteiro;
        double resultado;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de um numero inteiro: ");
        inteiro = teclado.nextInt();
        
        //Processamento de dados
        resultado = Math.pow(inteiro,2);
        
        //Saida de dados
        System.out.println("Este é o valor ao quadrado: "+resultado);
        System.out.println("Fim do programa");
    }
}
