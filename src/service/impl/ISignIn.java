package service.impl;

import service.interfaces.SignIn;

public class ISignIn implements SignIn {
    private static SignIn signIn;
    public  static SignIn getInstance(){
        if(signIn==null){
            signIn=new ISignIn();
        }
        return signIn;
    }
    @Override
    public void signIn() {
        System.out.println();
    }
}
