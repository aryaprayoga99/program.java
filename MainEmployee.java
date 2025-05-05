public class MainEmployee {
    public static void main(String[] args) {
        Employee e = new Employee("Ari");
        Manager m = new Manager("Sari");

        System.out.println(e.name + " bonus: " + e.getBonus());
        System.out.println(m.name + " bonus default: " + m.getBonus());
        System.out.println(m.name + " bonus with project: " + m.getBonus(3));
    }
}
