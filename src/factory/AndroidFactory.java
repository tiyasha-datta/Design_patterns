package factory;

import factory.components.Button.AndroidButton;
import factory.components.Button.Button;
import factory.components.Menu.AndroidMenu;
import factory.components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
