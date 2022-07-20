package com.company;

import java.util.Arrays;

public abstract class Farms {
    private String address;

    private String ownerName;

    public Farms(String address,  String ownerName) {
        this.address = address;
        this.ownerName = ownerName;
    }

    public abstract void animal();

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm1{" +
                "address='" + address + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}
