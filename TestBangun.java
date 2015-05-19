package com.company;

/**
 * Created by ASUS on 5/19/2015.
 */
public class TestBangun
{
    public static void main(String[] args)
    {
        SegitigaBermuda bangun_Segitiga = new SegitigaBermuda();
        LingkaranBulat bangun_Lingkaran = new LingkaranBulat();

        bangun_Segitiga.alas = 11;
        bangun_Segitiga.tinggi = 11;
        bangun_Segitiga.sisimiring = 35;
        bangun_Lingkaran.jari_jari= 11;
        bangun_Lingkaran.diameter= 35;

        bangun_Lingkaran.CetakKeLayar();
        System.out.println("Keliling Luas Lingkaran: " + bangun_Lingkaran.hitungLuasLingkaranBulat());
        System.out.println("Keliling Lingkarang Bulat: " + bangun_Lingkaran.hitungKelilingLingkaranBulat());

        bangun_Segitiga.CetakKeLayar();
        System.out.println("Luas Segitiga Bermuda: " + bangun_Segitiga.hitungLuasSegitiga());
        System.out.println("Luas Keliling Segitiga: " + bangun_Segitiga.hitungKelilingSegitiga());
    }

}