package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

/*Vetores (ou arrays), quando instanciados por uma classe, criam uma variavél
* que aponta para o conjunto de vetores que aponta para os valores inseridos
* posteriormente*/

public class ProgramProducts {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;

        System.out.printf("Avarage price: %.2f%n", avg);

        sc.close();
    }
}
