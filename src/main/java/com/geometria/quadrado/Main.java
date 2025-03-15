package com.geometria.quadrado;

import com.geometria.quadrado.controller.SquareController;
import com.geometria.quadrado.view.SquareView;

public class Main {
    public static void main(String[] args) {
        SquareView view = new SquareView();
        SquareController controller = new SquareController(view);
        controller.run();
    }
}
