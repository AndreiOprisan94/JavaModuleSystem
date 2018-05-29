module monitor {
    requires monitor.observer;
    requires monitor.observer.alpha;
    requires monitor.observer.beta;
    requires monitor.rest;
    requires monitor.statistics;
    requires monitor.persistence;
}