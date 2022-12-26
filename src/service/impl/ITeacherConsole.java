package service.impl;

import service.interfaces.TeacherConsole;

public class ITeacherConsole implements TeacherConsole {
    private static TeacherConsole teacherConsole;
    public  static TeacherConsole getInstance(){
        if(teacherConsole==null){
            teacherConsole=new ITeacherConsole();
        }
        return teacherConsole;
    }
    @Override
    public void teacherConsole() {

    }
}
