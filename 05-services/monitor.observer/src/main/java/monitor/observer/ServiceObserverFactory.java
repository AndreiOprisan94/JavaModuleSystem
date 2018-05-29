package monitor.observer;

import java.util.Optional;

public interface ServiceObserverFactory {
    Optional<ServiceObserver> getService(String serviceName);
}
