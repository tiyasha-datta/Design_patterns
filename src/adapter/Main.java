package adapter;

public class Main {
    public static void main(String[] args) {
        PhonePe phonePe = new PhonePe(new YesBankAPIAdapter());
        boolean res = phonePe.doTransaction("3243","24523",456,"23");
        System.out.println(res);
    }
}
