package monitor.observer.alpha;

import monitor.observer.ServiceObserver;
import monitor.observer.ServiceObserverFactory;

public final class AlphaServiceObserverFactory implements ServiceObserverFactory {
    @Override
    public ServiceObserver getService(String serviceName) {
        return new AlphaServiceObserver(serviceName);
    }
}
