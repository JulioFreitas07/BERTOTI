import java.util.ArrayList;
import java.util.List;

public class Manager implements EmployeeComponent {
    private String name;
    private String position;
    private List<EmployeeComponent> subordinates = new ArrayList<>();

    public Manager(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public void addSubordinate(EmployeeComponent subordinate) {
        subordinates.add(subordinate);
    }

    @Override
    public void showDetails() {
        System.out.println("Gerente: " + name + ", Cargo: " + position);
        for (EmployeeComponent subordinate : subordinates) {
            subordinate.showDetails();
        }
    }
}
