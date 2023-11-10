package pancadao2;

import java.util.Scanner;

public class Pancadao1v {
    public static void main(String[] args) {
        //Entrada de dados
        double A;
        double B;
        double resultado;
        double resultado2;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe um valor para A: ");
        A = teclado.nextDouble();
        System.out.println("Informe um valor para B: ");
        B = teclado.nextDouble();

        //Processamento de dados
        resultado = Math.pow(A,B);
        resultado2 = Math.pow(B,A);

        //Saida de dados
        System.out.println("O resultado de A elevado a B é: "+resultado);
        System.out.println("O resultado de B elevado a A é: "+resultado2);
        System.out.println("Fim do programa");
    }
}
