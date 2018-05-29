package monitor.observer.beta;

import monitor.observer.ServiceObserver;
import monitor.observer.ServiceObserverFactory;

public final class BetaServiceObserverFactory implements ServiceObserverFactory {
    @Override
    public ServiceObserver getService(String serviceName) {
        return new BetaServiceObserver(serviceName);
    }
}
