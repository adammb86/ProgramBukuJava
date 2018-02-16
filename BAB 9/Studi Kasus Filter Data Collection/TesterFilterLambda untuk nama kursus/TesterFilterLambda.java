import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TesterFilterLambda {

    public static void main(String[] args) {
        List<Kursus> kursus = new ArrayList<>();

        kursus.add(new Kursus("1", "SSC", 3000000));
        kursus.add(new Kursus("2", "GO", 5000000));
        kursus.add(new Kursus("3", "Neutron", 4000000));
        kursus.add(new Kursus("4", "EF", 2500000));

        // eskpresi lambda untuk memfilter nama kursus
        Stream<Kursus> kursus_filter = kursus.stream().
                filter(n -> n.getNamaKursus().contains("G"));

        // memunculkan hasil filter menggunakan foreach lambda
        kursus_filter.forEach(bimbel -> {
                    System.out.println(bimbel.getIdKursus());
                    System.out.println(bimbel.getNamaKursus());
                    System.out.println(bimbel.getHarga() + "\n");
                }
        );
    }
}
