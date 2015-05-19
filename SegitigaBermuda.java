package com.company;

/**
 * Created by ASUS on 5/19/2015.
 */
public class SegitigaBermuda
{
    int alas;
    int tinggi;
    int sisimiring;

    public void CetakKeLayar()
    {
        System.out.println("Luas Alas Segitiga Bermuda: " + alas);
        System.out.println("Luas Tinggi Segitiga Bermuda: " + tinggi);
        System.out.println("luas Sisimiring Segitiga Bermuda: " + sisimiring);

    }

    public  void ubahProperty(int alasBaru, int tinggiBaru, int sisimiring)
    {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisimiring = sisimiring;
    }

    public double hitungLuasSegitiga()
    {
        double luas;
        luas = ((0.5) * alas * tinggi);
        return luas;
    }

    public int hitungKelilingSegitiga()
    {
        int keliling;
        keliling = (alas + sisimiring + sisimiring);
        return keliling;
    }
}
