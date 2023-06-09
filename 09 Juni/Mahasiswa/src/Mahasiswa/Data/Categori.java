package Mahasiswa.Data;

public class Categori {

    private Integer id = 0;
    private boolean expensive;

    public Integer getId() {
        if (this.id >= 3) {
            return id;
        }
        return 0;
    }

    public void setId(Integer id) {
        if (id == 4) {
            this.id = 100;
        } else {
            this.id = id;
        }
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}