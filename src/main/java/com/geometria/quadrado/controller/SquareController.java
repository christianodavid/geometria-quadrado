package com.geometria.quadrado.controller;

import com.geometria.quadrado.model.Square;
import com.geometria.quadrado.view.SquareView;

public class SquareController {
    private final SquareView view;

    public SquareController(SquareView view) {
        this.view = view;
    }

    public void run() {
        int choice;

        do {
            choice = view. showMenu();

            if (choice != 0) {
                double side = view.getSideInput();
                Square square = new Square(side);

                switch (choice) {
                    case 1:
                        view.showResult("Área", square.calculateArea());
                        break;
                    case 2:
                        view.showResult("Perímetro", square.calculatePerimeter());
                        break;
                    default:
                        view.showError("Opção inválida. Tente novamente!");
                }
            }

        } while (choice != 0);
    }
}
