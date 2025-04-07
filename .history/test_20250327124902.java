
class Main {

    public static void main(String[] args) {
         test t = new test(28, "angel");
         System.out.println(t);

    }
}

    public record test(
            int age,
            String name) {

        public static test infoTest() {
            return new test(23, "angel");
        }
    }
