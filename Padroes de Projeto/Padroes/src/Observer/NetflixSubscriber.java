public class NetflixSubscriber implements EventListener {
    private String email;

    public NetflixSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String message) {
        System.out.println("Enviando notificação para Netflix para " + email + ": " + message);
    }
}
