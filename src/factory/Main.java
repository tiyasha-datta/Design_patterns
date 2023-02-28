package factory;

import factory.components.Button.Button;
import factory.components.Menu.Menu;

public class Main {

    public static void main(String[] args) {

        Flutter flutter = new Flutter(SupportedPlatform.IOS);
        Button button = flutter.createUIFactory().createButton();
        Menu menu = flutter.createUIFactory().createMenu();
    }

}
