package observer;

public class SellerNotifier implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public SellerNotifier(){
        Amajon a = Amajon.getInstance();
        a.registerOrderPlacedSubscriber(this);
    }
    @Override
    public ReturnData orderCancelEvent() {
        ReturnData r = new ReturnData("Consuming seller");
        System.out.println("seller subscriber -> consuming seller");
        return r;
    }

    @Override
    public ReturnData orderPlaceEvent() {
        ReturnData r = new ReturnData("cancelling seller");
        System.out.println("seller subscriber -> cancelling seller");
        return r;
    }
}
