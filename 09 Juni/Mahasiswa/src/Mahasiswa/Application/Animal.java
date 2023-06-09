package Mahasiswa.Application;

public abstract class Animal {
    public String nama;

    public abstract void run();
    // ketika ada method abstract maka wajib class tersebut juga abstract
    // method abstract tidak boleh ada {} (block method)
}