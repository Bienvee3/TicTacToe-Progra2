package doaltoBienvenido;

import java.util.Scanner;

public class Coordenada {

    private int fila;
    private int columna;
    private final int FILA_MINIMA = 1;
    private final int FILA_MAXIMA = 3;
    private final int COLUMNA_MINIMA = 1;
    private final int COLUMNA_MAXIMA = 3;

    public Coordenada(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        assert this.esValida();
    }

    public Coordenada() {
    }

    public void pedir() {
        do {
            System.out.print("> Fila? [1..3] ");
            this.fila = new Scanner(System.in).nextInt();
            System.out.print("> Columna? [1..3] ");
            this.columna = new Scanner(System.in).nextInt();
        } while (!this.esValida());
    }

    public boolean esValida() {
        return (fila >= FILA_MINIMA && fila <= FILA_MAXIMA && columna >= COLUMNA_MINIMA && columna <= COLUMNA_MAXIMA);
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean igual(Coordenada coordenada) {
        return this.fila == coordenada.fila && this.columna == coordenada.columna;
    }

    public int direccion(Coordenada coordenada) {
        if (fila == coordenada.fila) {
            return 0;
        } else if (columna == coordenada.columna) {
            return 1;
        } else if (fila - columna == 0 && coordenada.fila - coordenada.columna == 0) {
            return 2;
        } else if (fila + columna == 4 && coordenada.fila + coordenada.columna == 4) {
            return 3;
        } else {
            return -1;
        }
    }
}
