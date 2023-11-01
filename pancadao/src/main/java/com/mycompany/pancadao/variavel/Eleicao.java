package com.mycompany.pancadao.variavel;

public class Eleicao {
    public static void main(String[] args) {
        //Entrada de dados
        double a;
        double b;
        double c;
        double nulos;
        double brancos;
        double votosValidos;
        double votosTotais = 2500;
        
        //Processamento de dados
        
        a = (Math.random()*(votosTotais-1))+1;
        b = (Math.random()*(votosTotais-a-1))+1;
        c = (Math.random()*(votosTotais-a-b-1))+1;
        nulos = (Math.random()*(votosTotais-a-b-1))+1;
        brancos = (Math.random()* (votosTotais-a-b-c-1))+1;
        a = (a/votosTotais)*100;
        b = (b/votosTotais)*100;
        c = (c/votosTotais)*100;
        nulos = (nulos/votosTotais)*100;
        brancos = (brancos/votosTotais)*100;
        
        //Saida de dados
        System.out.println("Votos com porcentagem decimal");
        System.out.println("Foram registrados "+votosTotais+" votos");
        System.out.println("Porcentagem de votos do candidato A: " + a + "%");
        System.out.println("Porcentagem de votos do candidato B: " + b + "%");
        System.out.println("Porcentagem de votos do candidato C: " + c + "%");
        System.out.println("Porcentagem de votos nulos: " + nulos + "%");
        System.out.println("Porcentagem de votos brancos: " + brancos + "%\n");
        
        System.out.println("Votos com porcentagem arredondada");
        System.out.println("Foram registrados "+votosTotais+" votos");
        System.out.printf("Porcentagem de votos do candidato A: %4.2f %%\n", a);
        System.out.printf("Porcentagem de votos do candidato A: %.0f %%\n", a);//Aprendi isso
        System.out.printf("Porcentagem de votos do candidato B: %.0f%%\n", b);
        System.out.printf("Porcentagem de votos do candidato C: %.0f%%\n", c);
        System.out.printf("Porcentagem de votos nulos: %.0f%%\n", nulos);
        System.out.printf("Porcentagem de votos brancos: %.0f%%\n", brancos);
    }
}
