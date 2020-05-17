package application;

/*Vetores
* Em programação, "vetor" é o nome dado a arranjos unidimensionais
* Arranjo (array) é uma estrutura de dados
*   Homogenea (dados do mesmo tipo)
*   Ordenada (elementos acessados por meio de posições)
*   Alocada de uma vez só, em um bloco contiguo de memoria
* Vantagens
*   Acesso imediato aos elementos pela sua posição
* Desvantagens
*   Tamanho fixo
*   Dificuldade para realizar inserções e deleções
*
* Fazer um programa para ler um numero inteiro N e a Altura de N pessoas.
* Armazene as N alturas e um vetor. Em seguida, mostrar a altura media dessas pessoas*/

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("Avarage height: %.2f%n", avg);


        sc.close();
    }
}























