package Mahasiswa;

import Mahasiswa.Data.Categori;

public class CategoryApp {
    public static void main(String[] args) {
        var categori = new Categori();
        categori.setId(4);
        System.out.println(categori.getId());
    }
}