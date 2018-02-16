import java.util.Scanner;

public class OperasiString {

    public static void main(String[] args) {
        String username = new String();
        Scanner input = new Scanner(System.in);
        username = input.nextLine();

        if (username.contains(" ")) // mengandung spasi
            username = null;

        try {
            System.out.print(username.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Anda tidak memasukkan username yang benar");
        }
    }
}
