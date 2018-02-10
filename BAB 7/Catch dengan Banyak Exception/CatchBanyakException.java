import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchBanyakException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        try {
            angka=input.nextInt();
            FileWriter fw=new FileWriter("dataAngka.txt");
            fw.write(String.valueOf(angka));
        } catch (IOException | InputMismatchException e) {
            System.out.println(e);
        }
    }
}
