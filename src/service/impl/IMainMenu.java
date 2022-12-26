package service.impl;

import models.Role;
import models.User;
import service.interfaces.MainMenu;

public class IMainMenu implements MainMenu {
    private static MainMenu mainMenu;
    public  static MainMenu getInstance(){
        if(mainMenu==null){
            mainMenu=new IMainMenu();
        }
        return mainMenu;
    }
    @Override
    public void startProject() {
        User user = new User(User.getCurrentId(), "admin", "12", Role.ADMIN);

    }
}
