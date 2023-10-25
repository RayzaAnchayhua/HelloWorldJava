package com.binance.dolarreal;

import java.util.Scanner;
//@author Rayza
public class DolarReal {

    public static void main(String[] args) {
       double dolar;
       double reais;
       int cotacao = 5;
       
       //Entrada de dados
        Scanner teclado =  new Scanner(System.in);
        System.out.println("Favor informar quantos dolares você tem:");
        dolar = teclado.nextDouble();
        
        //Processamento de dados
        reais = dolar * cotacao;
        
        System.out.println("Este é o resultado em reais: " + reais );
    }
}
