package observer;

public class CustomerNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public CustomerNotifier(){
        Amajon a = Amajon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }
    @Override
    public ReturnData orderCancelEvent() {
        ReturnData r = new ReturnData("Consuming customer");
        System.out.println("customer subscriber -> consuming customer");
        return r;
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("cancelling customer");
        System.out.println("customer subscriber -> cancelling customer");
        return r;
    }
}
