package com.geometria.quadrado.view;

import java.util.Scanner;

public class SquareView {
    private final Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("\nCALCULADORA DE ÁREA E PERÍMETRO DO QUADRADO");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
        System.out.println("0. Sair");
        System.out.print("Digite uma opção: ");
        return scanner.nextInt();
    }

    public double getSideInput() {
        System.out.print("Digite o tamanho do lado do quadrado (em cm): ");
        return scanner.nextDouble();
    }

    public void showResult(String operation, double result) {
        System.out.printf(operation.equals("Área")
                ? "\n%s = %.2f cm²\n"
                : "\n%s = %.2f cm\n", operation, result);
    }

    public void showError(String message) {
        System.out.println("\nErro: " + message);
    }
}
