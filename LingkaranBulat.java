package com.company;

/**
 * Created by ASUS on 5/19/2015.
 */
public class LingkaranBulat
{
    int jari_jari;
    int diameter;

    public void CetakKeLayar()
    {
        System.out.println("Jari-Jari Lingkaran Bulat: " + jari_jari);
        System.out.println("Diameter Lingkaran Bulat: " + diameter);

    }

    public  void ubahProperty(int jariBaru, int diameterBaru)
    {
        jari_jari = jariBaru;
        diameter = diameterBaru;

    }

    public double hitungLuasLingkaranBulat()
    {
        double luas;
        luas = 3.14 * jari_jari * jari_jari;
        return luas;
    }

    public double hitungKelilingLingkaranBulat()
    {
        double keliling;
        keliling = 3.14 * diameter;
        return keliling;
    }
}
