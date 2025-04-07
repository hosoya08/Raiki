
class Main {

    public static void main(String[] args) {
        test t = new test(28, "angel");
        System.out.println(t.infoTest());

    }
}

public record test(
        int age,
        String name) {

    public static test infoTest() {
        return new test(23, "angel");
    }

    public String toString() {
        return ("test {" + "\n age : " + age + "\n name : " + name + "\n}");
    }
}

class Test {
    private final int age;
    private final String name;

    public Test(int age, String name) {
        this.age = age;
        this.name = name;
    }

    int age() {return age;}
    String name() {return name;}
}
