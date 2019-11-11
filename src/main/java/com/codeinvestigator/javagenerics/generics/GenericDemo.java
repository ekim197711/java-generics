package com.codeinvestigator.javagenerics.generics;

import java.util.Arrays;
import java.util.List;

public class GenericDemo {


    public <T extends Number & Comparable> List<T> fromArrayToList(T[] myarray){
        return Arrays.asList(myarray);
    }


}
