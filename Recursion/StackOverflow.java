public class StackOverflow {

    static void hello() {
        hello();     // Calls itself again and again
    }

    public static void main(String[] args) {
        hello();
    }
}
