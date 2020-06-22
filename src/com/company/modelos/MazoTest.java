package com.company.modelos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MazoTest {

    @Test
    public void cuandoMazoEsCreadoTieneCuarentaCartas(){
        Mazo mazo = new Mazo();

        assertEquals(40, mazo.getMazo());

    }


}