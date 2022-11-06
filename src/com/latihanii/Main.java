package com.latihanii;

public class Main
{
    public static void main(String[] args)
    {
        Bicycle bicycle = new Bicycle();
        System.out.println("【Info Sepeda】");
        bicycle.setNameBicycle("Bianchi");

        System.out.println("Nama: " + bicycle.getNameBicycle());
    }
}