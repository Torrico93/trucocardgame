package com.company.modelos;

public class Mazo {

    public static final int NUM_TOTAL_CARTAS = 40;
    private Carta cartas[];


    public Mazo() {
        this.cartas = new Carta[NUM_TOTAL_CARTAS];
        crearMazo();
    }

    public void crearMazo() {

            for (int iIndicePal = 0; iIndicePal<=Carta.PALOS.length ; iIndicePal++) {

                for (int jIndiceNum = 0 ; jIndiceNum<Carta.MAXIMO_DE_CARTAS_POR_PALO ; jIndiceNum++){

                    if (!( jIndiceNum == 7 || jIndiceNum == 8 )){

                        if (jIndiceNum>=9){
                            cartas[(iIndicePal* (Carta.MAXIMO_DE_CARTAS_POR_PALO-2))+ (jIndiceNum-2)] = new Carta(jIndiceNum+1, Carta.PALOS[iIndicePal]);
                        }else {
                            cartas[(iIndicePal* (Carta.MAXIMO_DE_CARTAS_POR_PALO-2))+ jIndiceNum] = new Carta(jIndiceNum+1, Carta.PALOS[iIndicePal]);
                        }
                    }
                }
            }
    }


    public static int getMazo() {
        return NUM_TOTAL_CARTAS;
    }

}
