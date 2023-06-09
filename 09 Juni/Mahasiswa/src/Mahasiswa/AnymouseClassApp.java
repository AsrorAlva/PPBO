package Mahasiswa;

import Mahasiswa.Data.HelloWorld;
public class AnymouseClassApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello");
            }

            public void sayHello(String nama) {
                System.out.println("Hello " + nama);
            }
        };

        /*
         * jika ingin bikin yang kedua maka harus bikin ulang semuanya (tidak bisa direuse atau banyak digunakan, karena akan ribet.
         * */

        english.sayHello();
        english.sayHello("Boby");

    }
}