public class HBOSubscriber implements EventListener {
    private String email;

    public HBOSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Enviando notificação para HBO para " + email + ": " + message);
    }
}
