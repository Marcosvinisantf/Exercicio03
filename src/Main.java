import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores.
        Scanner sc = new Scanner(System.in);
        System.out.println("Olá esse programa vai lever dois valores INTEIROS, que será representados pela letra A e B.\nCaso os dois valores forem iguais irá imprimir na tela os dois valores somados.\nAgora digite o primeiro numero que representara a letra A: ");
        int a = sc.nextInt();
        System.out.println("Agora digite um numero que irá representar a letra B: ");
        int b = sc.nextInt();
        int resultado = a + b;
        if (a == b) {
            System.out.println("Valores iguais, o resultado é: " + resultado);
        } else
            System.out.println("Valores diferentes");
    }
}
