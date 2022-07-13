package com.taile.PageObjects;

import com.taile.Utils.BrowserUtils;

public class LoginPage {

    private static String txtEmail = "input-email";
    private static String txtPassword = "input-password";
    private static String btnLogin = "Login";
    private static String lnkForgottenPassword = "Forgotten Password";

    public static void enterUserName(String email){
        BrowserUtils.enterText(txtEmail, email);
    }

    public static void enterPassword(String password){
        BrowserUtils.enterText(txtPassword, password);
    }

    public static void clickOnLogin(){
        BrowserUtils.clickOnElement(btnLogin);
    }

    public static void clickOnForgottenPassword(){
        BrowserUtils.clickOnElement(lnkForgottenPassword);
    }
}
