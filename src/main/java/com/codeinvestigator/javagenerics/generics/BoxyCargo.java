package com.codeinvestigator.javagenerics.generics;

public class BoxyCargo implements StandardCargo, CargoOpener {

    @Override
    public String toString() {
        return "BoxyCargo WE HAVE A LOT OF SPACE";
    }

    @Override
    public String howMany() {
        return "12";
    }

    @Override
    public String openup() {
        return "Opening boxy stuff";
    }
}
