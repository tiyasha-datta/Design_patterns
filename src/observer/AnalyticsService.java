package observer;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class AnalyticsService implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public AnalyticsService(){
        Amajon a = Amajon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }
    @Override
    public ReturnData orderCancelEvent() {
        ReturnData r = new ReturnData("Consuming analytics");
        System.out.println("analytics subscriber -> consuming analytics");
        return r;
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("cancelling analytics");
        System.out.println("analytics subscriber -> cancelling analytics");
        return r;
    }
}
