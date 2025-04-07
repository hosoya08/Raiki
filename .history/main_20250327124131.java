class Main {
    public static void main(String[] args) {

    }
}

class Test {
    public record test(
        int age,
        String name
        )
        {
       public test infoTest(){
            return age;
       }
    };
}
