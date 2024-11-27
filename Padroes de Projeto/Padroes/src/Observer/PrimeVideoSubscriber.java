public class PrimeVideoSubscriber implements EventListener {
    private String email;

    public PrimeVideoSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Enviando notificação para Prime Video para " + email + ": " + message);
    }
}
