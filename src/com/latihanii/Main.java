package com.latihanii;

public class Main
{
    public static void main(String[] args)
    {
        Bicycle sepeda = new Bicycle();
        System.out.println("【Info Sepeda】");
        sepeda.setNameSepeda("Bianchi");

        System.out.println("Nama: " + sepeda.getNameSepeda());
    }
}