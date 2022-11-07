package com.latihanii;

public class Car
{
    private String name;
    private String color;
    private int distance = 0;
    private int fuel = 100;

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

    public int getDistance()
    {
        return this.distance;
    }

    public int getFuel()
    {
        return this.fuel;
    }

    public void printData()
    {
        System.out.println("Nama: " + getName());
        System.out.println("Warna: " + getColor());
        System.out.println("Jarak: " + getDistance() + "km");
        System.out.println("Bahan Bakar: " + getFuel() + "L");
    }

    public void run(int distance)
    {
        System.out.println("Bergerak " + distance + "km...");
        if(distance <= this.fuel)
        {
            this.distance = this.distance + distance;
            this.fuel = this.fuel - this.distance;
        }

        else if(distance > this.fuel)
        {
            System.out.println("Bahan bakar tidak cukup");
            this.distance = this.distance;
            this.fuel = this.fuel;
        }

        System.out.println("Jarak: " + this.distance + "km");
        System.out.println("Bahan Bakar: " + this.fuel + "L");

    }

}
