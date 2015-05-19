package com.company;

/**
 * Created by ASUS on 5/19/2015.
 */
import com.company.mahasiswa;

public class testmahasiswa {
    public static void main(String[] args)
    {
        mahasiswa mhs = new mahasiswa("Ridwan Rismanto",20);
        mhs.tampilkanBiodata();

        System.out.println();

        mhs.setUmur(25);
        mhs.tampilkanBiodata();
    }
}
