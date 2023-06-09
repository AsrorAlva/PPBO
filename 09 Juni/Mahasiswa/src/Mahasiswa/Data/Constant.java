package Mahasiswa.Data;

public class Constant {
    public static final String APPLICATION = "Bekantan Jantan";
    public static int VERSION = 1;

    public static int sum(int... values) {
        /*
         * int... adalah nilai bisa lebih dari 1.
         * */

        int total  = 0;
        for (var value : values) {
            total += value;
        }
        return total;
    }

}