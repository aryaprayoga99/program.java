public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(5, 10);

        System.out.println("Luas Lingkaran: " + s1.getArea());
        System.out.println("Luas Persegi Panjang: " + s2.getArea());
    }
}
