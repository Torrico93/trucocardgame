package com.company.modelos;

public class Carta {
    public static final String PALOS[] = {"ESPADA", "BASTO", "COPA", "ORO"};
    public static final int MAXIMO_DE_CARTAS_POR_PALO = 12;

    private int numCarta;
    private String palo;


    public Carta(int numCarta, String palo) {
        this.numCarta = numCarta;
        this.palo = palo;
    }


    public int getNumCarta() {
        return numCarta;
    }

    public String getPalo() {
        return palo;
    }


    @Override
    public String toString() {
        return "Carta =" + numCarta + " de " + palo;
    }


}
