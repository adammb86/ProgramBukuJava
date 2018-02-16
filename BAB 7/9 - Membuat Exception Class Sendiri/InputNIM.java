import java.util.Scanner;

public class InputNIM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim = input.next();
        try {
            isiNIM(nim);
        } catch (NIMFormatException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void isiNIM(String nim) throws NIMFormatException {
        // Cek apakah NIM terdiri dari 8 digit angka
        if(nim.length() == 8 && nim.matches("[0-9]+")) {
            System.out.println("NIM anda adalah " + nim);
        } else {
            throw new NIMFormatException();
        }
    }
}
