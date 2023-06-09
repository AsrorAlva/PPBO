package Mahasiswa;

import Mahasiswa.Data.Country;
//import Mahasiswa.Data.Constant;
import static Mahasiswa.Data.Constant.*;

public class StaticApp {
    public static void main(String[] args) {
        // VARIABLE/FIELD/PROPERTI
//        var dataConstans = new Constant();
//        System.out.println(Constant.APPLICATION);
//        System.out.println(Constant.VERSION);
//
//        System.out.println(
//                Constant.sum(1,1,1,1,1)
//        );

        Country.City city = new Country.City(); // tidak bisa akses object outernya.
        city.setNama("Banjarmasin");

        System.out.println(city.getNama());


        // penggunaan static pada import
        System.out.println(APPLICATION);
        System.out.println(VERSION);

    }
}