public class VariasiLambda {
    private double p;
    private double l;
    private PersegiPanjang pp;

    //disediakan untuk pengaksesan ekpresi lambda
    interface PersegiPanjang {
        double operation(double p, double l);
    }

    interface Persegi {
        double operation(double sisi);
    }

    private double operasiPP(double p, double l, PersegiPanjang pp) {
        return pp.operation(p, l);
    }

    private double operasiPersegi(double sisi, Persegi persegi) {
        return persegi.operation(sisi);
    }


    public static void main(String[] args) {
        VariasiLambda varLambda = new VariasiLambda();

        //variasi 1: menggunakan deklarasi tipe data
        PersegiPanjang kelPP = (double p, double l) -> (2 * p) + (2 * l);

        //variasi 2: tanpa deklarasi tipe data
        PersegiPanjang luasPP = (p, l) -> p * l;

        //variasi 3: menggunakan return dan {}
        Persegi kelPersegi = sisi -> {
            //bisa melakukan sesuatu yang lain di sini
            return 4 * sisi;
        };

        //variasi 4: tanpa return dan {}
        Persegi luasPersegi = sisi -> sisi * sisi;

        System.out.println(varLambda.operasiPP(10, 5, kelPP));
        System.out.println(varLambda.operasiPP(10, 5, luasPP));
        System.out.println(varLambda.operasiPersegi(10, kelPersegi));
        System.out.println(varLambda.operasiPersegi(10, luasPersegi));
    }
}
