package com.latihanii;

public class Main
{
    public static void main(String[] args)
    {
        Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
        System.out.println("【Info Sepeda】");

        bicycle.printData();

        bicycle.run(10);
    }
}