package com.latihanii;

public class Bicycle
{
    private String nameBicycle;
    private String colorBicycle;

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

    public void printData()
    {
        System.out.println("Nama: " + getNameBicycle());
        System.out.println("Warna: " + getColorBicycle());
    }
}
