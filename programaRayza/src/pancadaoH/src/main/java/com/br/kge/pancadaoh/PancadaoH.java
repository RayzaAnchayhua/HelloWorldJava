package com.br.kge.pancadaoh;

import java.util.Scanner;

public class PancadaoH {

    public static void main(String[] args) {
        //Entrada de dados
        double volume;
        double comprimento;
        double largura;
        double altura;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe o valor do comprimento: ");
        comprimento = teclado.nextDouble();
        System.out.println("Informe o valor do largura: ");
        largura = teclado.nextDouble();
        System.out.println("Informe o valor do altura: ");
        altura = teclado.nextDouble();
        
        //Processamento de dados
        
        volume = altura*comprimento*largura;
        
        //Saida de dados
        System.out.println("O volume dessa caixa retangular é: "+volume);
        System.out.println("Fim do programa");
      
    }
}
