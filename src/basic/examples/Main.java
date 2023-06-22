package basic.examples;

import java.util.Locale;

public class Main {
    public static void main (String[] args){
        //print que pula linha
        System.out.println("Ola mundo!");
        //print que não pula linha
        System.out.print("Bom dia. ");
        System.out.println("Tudo bem?");

        //variavei inteira
        int idade = 32;

        String nome = "Ana";

        double renda = 4000.00;

        //variavel ponto flutuante
        double pontoFlutuante = 2.4129812;

        System.out.println("ponto flutuante: " + pontoFlutuante);
        //print formatado, retorna: 2,412981
        System.out.printf("formatação BR: " + "%.2f%n", pontoFlutuante);
        //o print formatado pega a configuração de anotação do computador
        // por isso está retornando os valores com a virgula
        // para isso precisamos configurar a lingua na nossa classe
        Locale.setDefault(Locale.US);
        System.out.printf("formatação US: " + "%.2f%n", pontoFlutuante);
        System.out.printf("Concatenando o numero %.2f direto no printf%n", pontoFlutuante);
        //%s = String;
        // %d = inteiro;
        // %f = ponto  flutuante;
        // %n = quebra linha;
        // %c = char
        System.out.printf("A %s tem %d anos e ganha %.2f reais %n", nome, idade, renda);
    }

}
