module monitor.observer.beta {
	requires transitive monitor.observer;
//	exports monitor.observer.beta;
	provides monitor.observer.ServiceObserverFactory
			with monitor.observer.beta.BetaServiceObserverFactory;
}
