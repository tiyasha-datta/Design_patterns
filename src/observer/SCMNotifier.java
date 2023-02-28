package observer;

public class SCMNotifier implements OrderCancelledSubscriber, OrderPlacedSubscriber{

    public SCMNotifier(){
        Amajon a = Amajon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }
    @Override
    public ReturnData orderCancelEvent() {
        ReturnData r = new ReturnData("Consuming scm");
        System.out.println("scm subscriber -> consuming scm");
        return r;
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("cancelling scm");
        System.out.println("scm subscriber -> cancelling scm");
        return r;
    }
}
