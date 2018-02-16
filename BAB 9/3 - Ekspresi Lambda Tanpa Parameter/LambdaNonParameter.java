public class LambdaNonParameter {
    
    interface KatakanPadaku {
        void katakan();
    }

    public static void main(String[] args) {
        KatakanPadaku say = () -> System.out.println("Iya, ada apa?");

        say.katakan();
    }
}
