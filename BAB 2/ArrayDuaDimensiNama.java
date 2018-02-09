public class ArrayDuaDimensiNama {
    public static void main(String[] args) {
        String[][] dataOrang = new String[3][2];

        dataOrang[0][0] = "Adam";
        dataOrang[0][1] = "Dago";

        dataOrang[1][0] = "Firman";
        dataOrang[1][1] = "Antapani";

        dataOrang[2][0] = "Evan";
        dataOrang[2][1] = "Cileunyi";

        // For untuk mengakses baris
        for (int i = 0; i < 3; i++) {
            // For untuk mengakses kolom
            for (int j = 0; j < 2; j++) {
                System.out.print(dataOrang[i][j] + " ");
            }
            System.out.println();
        }
    }
}
