public class App {
    public static void main(String[] args) {
        String g = "Cyrus";
        BasicEncryption bas = new BasicEncryption(g);

        System.out.println(bas.calcP1Encryption());
    }
}
