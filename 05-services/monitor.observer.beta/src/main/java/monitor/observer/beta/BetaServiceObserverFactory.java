package monitor.observer.beta;

import monitor.observer.ServiceObserver;
import monitor.observer.ServiceObserverFactory;

import java.util.Optional;

public final class BetaServiceObserverFactory implements ServiceObserverFactory {
    @Override
    public Optional<ServiceObserver> getService(String serviceName) {
        return BetaServiceObserver.createIfBetaService(serviceName);
    }
}
