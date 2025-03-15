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
            choice = view.showMenu();

            if (choice != 0) {
                double side;
                Square square;

                switch (choice) {
                    case 1:
                        side = view.getSideInput();
                        square = new Square(side);
                        view.showResult("Área", square.calculateArea());
                        break;
                    case 2:
                        side = view.getSideInput();
                        square = new Square(side);
                        view.showResult("Perímetro", square.calculatePerimeter());
                        break;
                    default:
                        view.showError("Opção inválida. Tente novamente!");
                }
            }

        } while (choice != 0);
    }
}
