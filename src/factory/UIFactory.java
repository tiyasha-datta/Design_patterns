package factory;

import factory.components.Button.Button;
import factory.components.Menu.Menu;

public interface UIFactory {

    Button createButton();
    Menu createMenu();
}
