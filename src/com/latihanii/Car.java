package com.latihanii;

public class Car
{
    private String name;
    private String color;
    private int distance = 0;

    Car(String name, String color)
    {
        this.name = name;
        this.color = color;
    }

    public String getName()
    {
        return this.name;
    }

    public String getColor()
    {
        return this.color;
    }

    public void printData()
    {
        System.out.println("Nama: " + getName());
        System.out.println("Warna: " + getColor());
        System.out.println("Jarak: " + this.distance + "km");
    }

}
