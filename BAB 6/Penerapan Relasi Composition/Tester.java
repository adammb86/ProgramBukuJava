public class Tester {

    public static void main(String[] args) {
        PC pc=new PC("HP",new MotherBoard("ATX"));//Composition

        System.out.println(pc.getMerekPC());
        System.out.println(pc.getMotherboard().getTipeMotherBoard());
    }
}
