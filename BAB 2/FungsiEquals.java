public class FungsiEquals {
    public static void main(String[] args) {
        String nama1 = "Adam";
        String nama2 = "Firman";
        String nama3 = "Adam";

        System.out.println("'" + nama1 + "' sama dengan '" + nama2 + "': " + 
                            nama1.equals(nama2));
        System.out.println("'" + nama1 + "' sama dengan '" + nama3 + "': " + 
                             nama1.equals(nama3));
    }
}
