public class MainCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add int: " + calc.add(2, 3));
        System.out.println("Add double: " + calc.add(2.5, 3.7));
        System.out.println("Add 3 int: " + calc.add(1, 2, 3));
    }
}
