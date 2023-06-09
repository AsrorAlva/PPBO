package Mahasiswa.Data;

public enum Gender {
    laki_laki("laki laki"),
    perempuan("perumpuan");

    private String description;

    Gender(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}