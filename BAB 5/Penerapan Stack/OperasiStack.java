import java.util.Stack;

public class OperasiStack {

    public static void main(String[] args) {
        Stack<String> nama=new Stack<>();

        //coba operasi push
        nama.push("Adam");
        nama.push("Rio");
        nama.push("Iva");
        nama.push("Ido");

        //coba operasi pop
        System.out.println(nama.pop()); //mengambil Ido
        System.out.println(nama.pop()); //mengambil Iva
    }
}
