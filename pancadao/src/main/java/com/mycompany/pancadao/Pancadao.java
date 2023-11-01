package com.mycompany.pancadao;

import java.util.Scanner;

public class Pancadao {

    public static void main(String[] args) {
        //Entrada de dados
        double a;
        double b;
        double c;
        double nulos;
        double brancos;
        double votosTotais;
        double votosValidos;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os votos de A: ");
        a = teclado.nextInt();
        System.out.println("Digite os votos de B: ");
        b = teclado.nextInt();
        System.out.println("Digite os votos de C: ");
        c = teclado.nextInt();
        System.out.println("Digite os votos de nulos: ");
        nulos = teclado.nextInt();
        System.out.println("Digite os votos de brancos: ");
        brancos = teclado.nextInt();
        
        //Processamento de dados
        votosTotais=a+b+c+nulos+brancos;
        votosValidos = (a+b+c)*100/votosTotais;
        a = (a/votosTotais)*100;
        b = (b/votosTotais)*100;
        c = (c/votosTotais)*100;
        nulos = (nulos/votosTotais)*100;
        brancos = (brancos/votosTotais)*100;
        
        //Saida de dados
        System.out.println("Foram registrados "+votosTotais+"votos");
        System.out.println("O percentual de votos validos foi de "+votosValidos+"%");
        System.out.println("Porcentagem de votos do candidato A: " + a + "%");
        System.out.println("Porcentagem de votos do candidato B: " + b + "%");
        System.out.println("Porcentagem de votos do candidato C: " + c + "%");
        System.out.println("Porcentagem de votos nulos: " + nulos + "%");
        System.out.println("Porcentagem de votos brancos: " + brancos + "%");

        
        
    }
}
