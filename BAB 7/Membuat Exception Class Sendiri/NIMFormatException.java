public class NIMFormatException extends Exception {
    @Override
    public String getMessage() {
        return "NIM harus terdiri dari 8 digit angka";
    }
}
