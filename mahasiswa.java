package com.company;

/**
 * Created by ASUS on 5/19/2015.
 */
public class mahasiswa {
    private String Nama;
    private int Umur;

    public mahasiswa(String nama, int umur){
        Nama = nama ;
        Umur = umur;
    }

    public void setNama(String name) {
        Nama = name;
    }
    public String getNama(){
        return Nama;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }
    public int getUmur(){
        return Umur;

    }
    public void tampilkanBiodata(){
        System.out.println("===== BIODATA =====");
        System.out.println("Nama Seseorang = " + Nama);
        System.out.println("Umur Seseorang = " + Umur);

    }
}