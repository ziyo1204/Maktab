package service.impl;

import service.interfaces.AdminConsole;

public class IAdminConsole implements AdminConsole {
    private static AdminConsole adminConsole;
    public  static AdminConsole getInstance(){
        if(adminConsole==null){
            adminConsole=new IAdminConsole();
        }
        return adminConsole;
    }
    @Override
    public void adminConsole() {

    }
}
