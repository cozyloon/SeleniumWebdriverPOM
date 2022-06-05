package com.example.qa.functions;

import com.example.qa.pages.LoginPage;

public class Login {
    private static LoginPage loginPage = new LoginPage();

    public static boolean validateLoginPageIsDisplayed() {
        loginPage.navigateToURL();
        return loginPage.isDisplayedHomePageLogo();
    }

    public static void userLogin(String username, String password) {
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        loginPage.clickLoginBtn();
    }

    public static String lblErrorMsg() {
        return loginPage.errorMsgIsDisplayed();
    }
}
