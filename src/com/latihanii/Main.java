package com.latihanii;

public class Main
{
    public static void main(String[] args)
    {
        Bicycle bicycle = new Bicycle();
        System.out.println("【Info Sepeda】");

        bicycle.setNameBicycle("Bianchi");
        bicycle.setColorBicycle("Hijau");

        bicycle.printData();
    }
}