
class Main {

    public static void main(String[] args) {
         test t = new test();
         System.err.println(t.infoTest());

    }
}

    public record test(
            int age,
            String name) {

        public static test infoTest() {
            return new test(23, "angel");
        }
    }
