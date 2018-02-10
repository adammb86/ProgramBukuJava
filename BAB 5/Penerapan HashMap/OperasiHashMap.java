import java.util.HashMap;

public class OperasiHashMap {

    public static void main(String[] args) {
        HashMap<String, String> provinsi=new HashMap<>();

        //coba operasi put
        provinsi.put("Jawa Barat","Bandung");
        provinsi.put("Jawa Tengah","Semarang");
        provinsi.put("Jawa Timur","Surabaya");

        //coba operasi get
        System.out.println(provinsi.get("Jawa Barat")); //Bandung

        //coba operasi containsKey dan containsValue
        System.out.println(provinsi.containsKey("Sumatra Barat")); //False
        System.out.println(provinsi.containsValue("Semarang")); //True
    }
}
