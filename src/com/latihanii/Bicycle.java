package com.latihanii;

public class Bicycle
{
    private String name;
    private String color;
    private int distance = 0;

    Bicycle(String name, String color)
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
