import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamingService {
    private Map<String, List<EventListener>> eventListeners;
    private String serviceName;

    public StreamingService(String serviceName) {
        this.serviceName = serviceName;
        this.eventListeners = new HashMap<>();
    }

    public void subscribe(String eventType, EventListener listener) {
        eventListeners.putIfAbsent(eventType, new ArrayList<>());
        eventListeners.get(eventType).add(listener);
    }

    private void notify(String eventType, String message) {
        List<EventListener> listeners = eventListeners.get(eventType);
        if (listeners != null) {
            for (EventListener listener : listeners) {
                listener.update(message);
            }
        }
    }


    public void addNewRelease(String title) {
        System.out.println(serviceName + " lançou um novo título: " + title);
        notify("newRelease", "Novo lançamento disponível: " + title);
    }

    public void addDiscount(String discountInfo) {
        System.out.println(serviceName + " tem uma nova promoção: " + discountInfo);
        notify("discount", "Aproveite a promoção: " + discountInfo);
    }

    public void addFeatureUpdate(String featureInfo) {
        System.out.println(serviceName + " tem uma nova funcionalidade: " + featureInfo);
        notify("featureUpdate", "Nova funcionalidade disponível: " + featureInfo);
    }
}
