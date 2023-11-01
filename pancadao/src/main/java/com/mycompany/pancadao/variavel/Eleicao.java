package com.mycompany.pancadao.variavel;

public class Eleicao {
    public static void main(String[] args) {
        //Entrada de dados
        int a;
        int b;
        int c;
        int nulos;
        int brancos;
        int votosValidos;
        int votosTotais = 2500;
        
        //Processamento de dados
        
        a = (int) (Math.random()*(votosTotais-1))+1;
        System.out.println("a"+a);
        b = (int) (Math.random()*(votosTotais-a-1))+1;
        c = (int) (Math.random()*(votosTotais-a-b-1))+1;
        nulos = (int) (Math.random()*(votosTotais-a-b-1))+1;
        brancos = (int)(Math.random()* (votosTotais-a-b-c-1))+1;
        //Ta funcionando ;)
        a = (a/votosTotais)*100;
        
        
      
        //Saida de dados
        System.out.println("Foram registrados "+votosTotais+" votos");
        System.out.println("Porcentagem de votos do candidato A: " + a + "%");
        System.out.println("Porcentagem de votos do candidato B: " + b + "%");
        System.out.println("Porcentagem de votos do candidato C: " + c + "%");
        System.out.println("Porcentagem de votos nulos: " + nulos + "%");
        System.out.println("Porcentagem de votos brancos: " + brancos + "%");
        
        
    }
}
