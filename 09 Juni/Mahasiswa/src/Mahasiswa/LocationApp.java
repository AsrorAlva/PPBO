package Mahasiswa;

import Mahasiswa.Application.Location;
import Mahasiswa.Data.City;

public class LocationApp {
    public static void main(String[] args) {
        var city = new City();
        city.nama = "Banjarmasin";

        System.out.println(city.nama);

        // var App = new Location(); // nggak bisa, karena dia adalah abstract class

    }
}