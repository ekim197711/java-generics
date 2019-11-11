package com.codeinvestigator.javagenerics.generics;

public class BubbleWrapCargo implements StandardCargo, CargoOpener {


    @Override
    public String toString() {
        return "BubbleWrapCargo A lot of bubbles bubble bubble bubble";
    }

    @Override
    public String howMany() {
        return "200";
    }

    @Override
    public String openup() {
        return "Opening up some bubble stuff";
    }
}
