import service.impl.IMainMenu;
import service.interfaces.MainMenu;

public class Application {
    public static void main(String[] args) {
        MainMenu instance = IMainMenu.getInstance();
        instance.startProject();
    }
}