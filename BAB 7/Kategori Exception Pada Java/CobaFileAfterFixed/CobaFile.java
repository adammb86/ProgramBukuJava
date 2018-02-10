import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CobaFile {

    public static void main(String[] args) {
        File dataBinatang=new File("C://databinatang.txt");
        try {
            FileReader baca=new FileReader(dataBinatang);
        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan");
        }
    }
}