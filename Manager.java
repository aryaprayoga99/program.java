public class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    public double getBonus() {
        return 2_000_000;
    }

    // Overloading: bonus tambahan berdasarkan proyek
    public double getBonus(int completedProjects) {
        return getBonus() + (completedProjects * 500_000);
    }
}
