package service.impl;

import service.interfaces.PupilConsole;

public class IPupilConsole implements PupilConsole {
    private static PupilConsole pupilConsole;
    public  static PupilConsole getInstance(){
        if(pupilConsole==null){
            pupilConsole=new IPupilConsole();
        }
        return pupilConsole;
    }
    @Override
    public void pupilConsole() {

    }
}
