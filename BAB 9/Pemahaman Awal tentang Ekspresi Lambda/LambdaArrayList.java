import java.util.*;

public class LambdaArrayList {

    public static void urutTanpaLambda(List<String> nama){
        Collections.sort(nama, new Comparator<String>() {
            @Override
            public int compare(String string1, String string2) {
                return string1.compareTo(string2);
            }
        });
    }

    public static void urutPakaiLambda(List<String> nama){
        Collections.sort(nama,(s1,s2)->s1.compareTo(s2));
    }

    public static void main(String[] args) {
        List<String> nama1=new ArrayList<>();
        List<String> nama2=new ArrayList<>();

        Scanner input=new Scanner(System.in);

        nama1.add(input.next());
        nama1.add(input.next());
        nama1.add(input.next());
        nama1.add(input.next());

        nama2.addAll(nama1);

        System.out.println("Hasil sorting tanpa lambda:");
        urutTanpaLambda(nama1);
        System.out.println(nama1);

        System.out.println("Hasil sorting pakai lambda");
        urutPakaiLambda(nama2);
        System.out.println(nama2);
    }
}
