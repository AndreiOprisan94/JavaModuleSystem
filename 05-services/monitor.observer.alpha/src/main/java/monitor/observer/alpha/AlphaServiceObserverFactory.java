package monitor.observer.alpha;

import monitor.observer.ServiceObserver;
import monitor.observer.ServiceObserverFactory;

import java.util.Optional;

public final class AlphaServiceObserverFactory implements ServiceObserverFactory {
    @Override
    public Optional<ServiceObserver> getService(String serviceName) {
        return AlphaServiceObserver.createIfAlphaService(serviceName);
    }
}
