/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade_array;

/**
 *
 * @author Koragem
 */
import java.util.Scanner;
import java.util.Arrays;
public class Atividade_array {


    public static void main(String[] args) {
        
    //algoritmo1, 0 a 10 números (pares)
    //Abra outro scanner    
    Scanner input = new Scanner (System.in);
    
        
    //array
    int[] numeros =new int [10];
    int[] pares = new int [10];
    int[] impares = new int [10];
    int contadorPares= 0;
    int contadorImpares= 0;
    
    System.out.println("===========Exiba Pares===========");
    
    System.out.println ("Digite 10 números");
    for (int i=0; i < numeros.length; i++){
        System.out.print("Número" + (i + 1) + ": " );
        numeros[i] = input.nextInt();
        
        if (numeros[i]%2 ==0) {
           pares[contadorPares] = numeros[i];
           contadorPares++;
        
    } else {
            impares[contadorImpares]=numeros[i];
            contadorImpares++;
        }
    }
        System.out.println("\nNúmeros pares: ");
        for (int i = 0; i < contadorPares; i++) {
        System.out.println(pares[i]);
            
        }
        
        System.out.println("\nNúmeros Impares: ");
        for (int i = 0; i < contadorImpares; i++) {
        System.out.println(impares[i]);
        
        }
        
        
    //Algoritmo 2, Nomes crescente e decrescente

        // Pergunta quantos nomes ele deseja digitar
        System.out.print("Quantos nomes você quer digitar? ");
        int qtd = input.nextInt();   // um número inteiro
        input.nextLine();            // limpa o buffer do teclado (evita pular o próximo input)

        // Cria um array de Strings com o tamanho informado pelo usuário
        String[] nomes = new String[qtd];

        // Laço para ler os nomes e armazenar no array
        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = input.nextLine();  // lê cada nome digitado
        }

        // Usa o método Arrays.sort() para ordenar o array em ordem alfabética (crescente)
        Arrays.sort(nomes);

        // Exibe os nomes em ordem crescente (A → Z)
        System.out.println("\n========== Ordem Crescente (A-Z) ==========");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        // Exibe os nomes em ordem decrescente (Z → A)
        // Basta percorrer o array de trás para frente
        System.out.println("\n========= Ordem Decrescente (Z-A) ==========");
        for (int i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }

        // Fecha o Scanner
        input.close();
        
    }
}
