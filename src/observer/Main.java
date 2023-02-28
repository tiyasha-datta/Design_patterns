package observer;

public class Main {
    public static void main(String[] args) {
        Amajon a = Amajon.getInstance();
        AnalyticsService analyticsService = new AnalyticsService();
        CustomerNotifier customerNotifier = new CustomerNotifier();
        SCMNotifier scmNotifier = new SCMNotifier();
        SellerNotifier sellerNotifier = new SellerNotifier();

        a.orderPlaceEvent();
    }
}
