package com.mycompany.ihmprj;

public class Main {
    public static void main(String args[]){
        Model UserInfo=new Model();
        SignUPView Interface1=new SignUPView();
//        LogInView Interface2=new LogInView();
        SignUPViewController C1=new SignUPViewController(UserInfo,Interface1);
//        LogInViewController C2=new LogInViewController(Interface2,C1.getUsers());
    }
}