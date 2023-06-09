package Mahasiswa;

import Mahasiswa.Data.Car;
import Mahasiswa.Data.Avanza;
public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        /*
         * hanya bisa menggunakan polymorpism.
         * jika instansiasi biasa seperti
         * var car = new car(); ini tidak bisa
         * */
        System.out.println(car.getTier());
        car.drive();
    }
}