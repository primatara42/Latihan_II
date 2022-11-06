package com.latihanii;

public class Bicycle
{
    private String nameBicycle;
    private String colorBicycle;

    private int distanceBicycle;

    public String setNameBicycle(String nameBicycle)
    {
        return this.nameBicycle = nameBicycle;
    }

    public String getNameBicycle()
    {
        return this.nameBicycle;
    }

    public String setColorBicycle(String colorBicycle)
    {
        return this.colorBicycle = colorBicycle;
    }

    public String getColorBicycle()
    {
        return this.colorBicycle;
    }

    public int setDistanceBicycle(int distanceBicycle)
    {
        return this.distanceBicycle = distanceBicycle;
    }

    public int getDistanceBicycle()
    {
        return this.distanceBicycle;
    }

    public void printData()
    {
        System.out.println("Nama: " + getNameBicycle());
        System.out.println("Warna: " + getColorBicycle());
        System.out.println("Jarak: " + getDistanceBicycle() + "km");
    }
}
