public class CastingObject {

    public static void main(String[] args) {
        try {
            Object object = new String("Adam MB");
            int angka = (Integer) object;
        } catch (ClassCastException e) {
            System.out.println("Kesalahan type cast Class");
        }
    }
}
