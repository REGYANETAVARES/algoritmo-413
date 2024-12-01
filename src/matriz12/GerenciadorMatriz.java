/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriz12;

import java.util.Scanner;

public class GerenciadorMatriz {

    private final int[][] matriz = new int[5][5];
    private int soma = 0;

    public void executar() {
        // Entrada de dados na matriz
        preencherMatriz();

        // Exibe a matriz completa
        imprimirMatriz();

        // Calcula e exibe o resultado
        calcularEExibirResultado();
    }

    private void preencherMatriz() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o elemento da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    private void imprimirMatriz() {
        System.out.println("\nToda a matriz:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private void calcularEExibirResultado() {
        // Calcula a soma dos quadrados dos números ímpares abaixo da diagonal secundária
        for (int i = 1; i < 5; i++) {
            for (int j = 5 - i; j < 5; j++) {
                if (matriz[i][j] % 2 != 0) {
                    soma += matriz[i][j] * matriz[i][j];
                }
            }
        }

        // Calcula a raiz quadrada da soma
        double raizQuadrada = Math.sqrt(soma);

        // Imprime o resultado
        System.out.printf("\nRaiz quadrada da soma dos quadrados dos números ímpares abaixo da diagonal secundária: %.2f\n", raizQuadrada);
    }
}
