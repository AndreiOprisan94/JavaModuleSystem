module monitor {
//	requires monitor.observer;
//	requires monitor.observer.alpha;
//	requires monitor.observer.beta;
	uses monitor.observer.ServiceObserverFactory;
	requires monitor.statistics;
	requires monitor.persistence;
	requires monitor.rest;
}
