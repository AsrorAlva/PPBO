package Mahasiswa;

import Mahasiswa.Data.Costumer;
import Mahasiswa.Data.Gender;

public class EnumApp {
    public static void main(String[] args) {
        Costumer costumer = new Costumer();
        costumer.setNama("bekantan");
        costumer.setGender(Gender.laki_laki);

        System.out.println(costumer.getNama());
        System.out.println(costumer.getGender());
        System.out.println(costumer.getGender().getDescription());

        // CONVERSI
        String levelName = Gender.laki_laki.name(); // conversi ke string
        System.out.println(levelName);

        Gender genderdata = Gender.valueOf("laki_laki"); // conversi ke gender enum
        System.out.println(genderdata);

    }
}