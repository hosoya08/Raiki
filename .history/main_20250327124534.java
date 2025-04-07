
class Main {

    public static void main(String[] args) {
         Test t = new Test();
         System.err.println(t.test.infoTest());

    }
}

class Test {

    public record test(
            int age,
            String name) {

        public static test infoTest() {
            return new test(23, "angel");
        }
    }
;
}
