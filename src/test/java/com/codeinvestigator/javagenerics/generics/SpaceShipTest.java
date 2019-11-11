package com.codeinvestigator.javagenerics.generics;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SpaceShipTest {

    @Test
    public void testBlowUpCargo() {
        new SpaceShip<BoxyCargo>().blowUp(
                List.of(
                        new BoxyCargo(),
                        new BoxyCargo(),
                        new BoxyCargo(),
                        new BubbleWrapCargo(),
                        new BubbleWrapCargo(),
                        new BubbleWrapCargo(),
                        new BubbleWrapCargo()
                )
        );
    }

        @Test
    public void testCargo(){
        SpaceShip<BoxyCargo> ss = new SpaceShip<>();
        ss.setMyCargo(new BoxyCargo());
        ss.showCargo();


        SpaceShip<BubbleWrapCargo> ss2 = new SpaceShip<>();
        ss2.setMyCargo(new BubbleWrapCargo());
        ss2.showCargo();

    }

    @Test
    public void testShowValue() {
        new SpaceShip<BubbleWrapCargo>().showValue(new BigDecimal(1234.123d));
    }

    }