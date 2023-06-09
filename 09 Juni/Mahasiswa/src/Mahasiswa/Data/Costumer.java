package Mahasiswa.Data;
import Mahasiswa.Data.Gender;

public class Costumer {
    private String nama;
    private Gender gender; // satu package dengan Enum nya, jika beda package akan error

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}