package Mahasiswa.Data;

public class Company {
    // class outer
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public class Employee { // inner class
        private String nama;

        public String getCompany() {
            return Company.this.getNama(); // akses private field outernya
        }

        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }
    }

}