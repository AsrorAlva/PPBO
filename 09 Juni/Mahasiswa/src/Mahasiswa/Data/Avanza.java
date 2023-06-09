package Mahasiswa.Data;

public class Avanza implements Car {
    /*
     * wajib semua method pada interface di implementasikan diturunan nya
     * */
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public void price() {

    }

    @Override
    public String getBrand() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBrand'");
    }

}