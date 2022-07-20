package com.company;

import java.util.Arrays;

public class Farm2 extends Farms{
    private Sheep[] sheep;
    private Cow[] cows;
    private Horse[] horses;

    public Farm2(String address, String ownerName, Cow[] cows, Horse[] horses, Sheep[] sheep) {
        super(address, ownerName);
        this.sheep = sheep;
        this.cows =cows;
        this.horses = horses;
    }

    @Override
    public void animal() {

    }

    @Override
    public String toString() {
        return "Farm2{" +"\n"+
                "Address "+getAddress()+"\n"+
                "Cow " + Arrays.toString(cows) +"\n"+
                "Horse "+ Arrays.toString(horses) +"\n"+
                "Sheep " + Arrays.toString(sheep) + "\n"+
                "OwnerName "+getOwnerName()+
                '}';
    }
}
