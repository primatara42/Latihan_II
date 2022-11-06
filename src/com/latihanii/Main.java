package com.latihanii;

public class Main
{
    public static void main(String[] args)
    {
        Bicycle bicycle = new Bicycle();
        System.out.println("【Informasi Sepeda】");

        bicycle.setNameBicycle("Bianchi");
        bicycle.setColorBicycle("Hijau");
        bicycle.setDistanceBicycle(0);


        bicycle.printData();
    }
}