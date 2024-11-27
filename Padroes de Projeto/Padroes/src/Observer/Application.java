public class Application {
    public static void main(String[] args) {
        StreamingService primeVideo = new StreamingService("Prime Video");
        StreamingService netflix = new StreamingService("Netflix");
        StreamingService hbo = new StreamingService("HBO");

        EventListener primeUser = new PrimeVideoSubscriber("user_prime@example.com");
        EventListener netflixUser = new NetflixSubscriber("user_netflix@example.com");
        EventListener hboUser = new HBOSubscriber("user_hbo@example.com");

        primeVideo.subscribe("newRelease", primeUser);
        netflix.subscribe("discount", netflixUser);
        hbo.subscribe("featureUpdate", hboUser);

        primeVideo.addNewRelease("The Boys Season 3");
        netflix.addDiscount("20% de desconto no próximo mês!");
        hbo.addFeatureUpdate("Nova funcionalidade de download offline disponível.");
    }
}
