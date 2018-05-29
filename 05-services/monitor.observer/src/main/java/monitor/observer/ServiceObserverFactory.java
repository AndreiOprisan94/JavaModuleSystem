package monitor.observer;

public interface ServiceObserverFactory {
    ServiceObserver getService(String serviceName);
}
