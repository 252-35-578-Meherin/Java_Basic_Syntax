 public class Main {

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static void sayHi(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {

        sayHi("Meherin Ritu");

        int result = getSum(25, 35);

        System.out.println("Sum: " + result);

    }
}