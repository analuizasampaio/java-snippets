package basic.examples;

import java.util.Locale;

public class ExercicioSaida {
    public static void main(String[] args){
        String produto1 = "Computador";
        String produto2 = "Mesa de escritório";

        int idade = 30;
        int codigo = 5290;
        char genero = 'F';

        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.123987;

        System.out.println("Produtos:");
        System.out.printf("%s, cujo o valor é %.2f%n", produto1, preco1);
        System.out.printf("%s, cujo o valor é %.2f%n%n", produto2, preco2);

        System.out.printf("Record: %d anos, codigo %d e genero %c%n%n", idade, codigo, genero);

        System.out.printf("Medida com oito casas decimais: %.8f%n", medida);
        System.out.printf("Arredondado (três casas decimais): %.3f%n", medida);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n", medida);

    }




}
