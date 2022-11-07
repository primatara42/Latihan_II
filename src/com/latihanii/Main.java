package com.latihanii;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
        Car car = new Car("Ferrari", "Merah");

        System.out.println("【Info Sepeda】");
        bicycle.printData();
        System.out.println("-----------------");


        int bicycleDistance;
        System.out.print("Masukkan jarak yang akan ditempuh: ");
        bicycleDistance = scanner.nextInt();
        bicycle.run(bicycleDistance);
        System.out.println("=================");


        System.out.println("【Info Mobil】");
        car.printData();
        System.out.println("-----------------");

        int carDistance;
        System.out.print("Masukkan jarak yang akan ditempuh: ");
        carDistance = scanner.nextInt();
        car.run(carDistance);
        System.out.println("-----------------");


        int carRefill;
        System.out.print("Masukkan jumlah isi ulang bahan bakar: ");
        carRefill = scanner.nextInt();
        car.charge(carRefill);

    }
}