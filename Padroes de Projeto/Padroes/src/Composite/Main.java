public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("João", "Desenvolvedor");
        Worker worker2 = new Worker("Maria", "Analista");

        Manager manager = new Manager("Carlos", "Gerente de TI");
        manager.addSubordinate(worker1);
        manager.addSubordinate(worker2);

        Worker worker3 = new Worker("Ana", "Designer");

        Manager ceo = new Manager("Roberto", "CEO");
        ceo.addSubordinate(manager);
        ceo.addSubordinate(worker3);

        ceo.showDetails();
    }
}
