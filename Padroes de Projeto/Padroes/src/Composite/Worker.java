public class Worker implements EmployeeComponent {
    private String name;
    private String position;

    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Funcionário: " + name + ", Cargo: " + position);
    }
}
