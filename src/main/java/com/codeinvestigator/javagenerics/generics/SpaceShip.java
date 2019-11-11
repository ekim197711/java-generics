package com.codeinvestigator.javagenerics.generics;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.nio.file.StandardCopyOption;
import java.util.List;

@Data
@Slf4j
public class SpaceShip<C extends StandardCargo & CargoOpener> {
    private C myCargo;
    public void showCargo(){
      log.info(String.format("My Cargo is: %s amount: %s, openup: %s",
              myCargo.toString(),
              myCargo.howMany()
      ,myCargo.openup()));
    }

    public void blowUp(List<? extends StandardCargo> listOfCargo){
        listOfCargo.forEach(cargo -> log.info(String.format("Zaaapppppp kabuumm %s", cargo)));
    }

    public <B extends Number> void showValue(B value){
        log.info(String.format("The Int value is: %d", value.intValue()));
    }

}
