
class Main {
    public static void main(String[] args) {
         test t = new test(28, "angel");
         t.infoTest();

         System.out.println(t.infoTest());

    }
}

    public record test(
            int age,
            String name) {

        public static test infoTest() {
            return new test(23, "angel");
        }

        public String toString(){
            return ("test {" + "\n age : " + age + "\n name : " + name + "\n}");
        }
    }
