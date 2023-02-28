package factory;

import factory.components.Button.Button;
import factory.components.Button.WindowsButton;
import factory.components.Menu.Menu;
import factory.components.Menu.WindowsMenu;

public class WindowsFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
