package factory;

import factory.components.Button.Button;
import factory.components.Button.IOSButton;
import factory.components.Menu.IOSMenu;
import factory.components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
