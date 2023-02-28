package observer;

import java.util.ArrayList;
import java.util.List;

public class Amajon {

    List<OrderCancelledSubscriber> orderCancelledSubscriberList = new ArrayList<>();
    List<OrderPlacedSubscriber> orderPlacedSubscriberList = new ArrayList<>();

    private static Amajon instance;

    private Amajon(){

    }

    public static Amajon getInstance(){
        if(instance == null){
            synchronized (Amajon.class){
                if(instance == null){
                    instance = new Amajon();
                }
            }
        }
        return instance;
    }

    public void registerOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.add(orderPlacedSubscriber);
    }

    public void deRegisterOrderPlacedSubscriber(OrderPlacedSubscriber orderPlacedSubscriber){
        orderPlacedSubscriberList.remove(orderPlacedSubscriber);
    }

    public void registerOrderCancelSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscriberList.add(orderCancelledSubscriber);
    }

    public void deRegisterOrderCancelSubscriber(OrderCancelledSubscriber orderCancelledSubscriber){
        orderCancelledSubscriberList.remove(orderCancelledSubscriber);
    }

    public void orderPlaceEvent(){
        for(OrderPlacedSubscriber o : orderPlacedSubscriberList){
            o.orderPlaceEvent();
        }
    }

    public void orderCancelEvent(){
        for(OrderCancelledSubscriber o : orderCancelledSubscriberList){
            o.orderCancelEvent();
        }
    }
}
