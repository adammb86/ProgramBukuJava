public class BidirectionalOneOne {

    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMAT Krida Nusantara");
        KepalaSekolah kepalaSekolah = new KepalaSekolah("Pak Uus");

        // association bidirectional terjadi di sini
        sekolah.setKepalaSekolah(kepalaSekolah);
        kepalaSekolah.setSekolah(sekolah);

        // memunculkan nilai dari objek sekolah
        System.out.println(sekolah.getNamaSekolah());
        System.out.println(sekolah.getKepalaSekolah()
                .getNamaKepalaSekolah());

        // memunculkan nilai dari objek kepala sekolah
        System.out.println(kepalaSekolah.getNamaKepalaSekolah());
        System.out.println(kepalaSekolah.getSekolah().getNamaSekolah());
    }
}
