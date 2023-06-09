package Mahasiswa.Data;

public interface Car extends HasBrand {
    void drive();

    /*
     * otomatis menjadi public abstract secara default
     * */

    int getTier();

}