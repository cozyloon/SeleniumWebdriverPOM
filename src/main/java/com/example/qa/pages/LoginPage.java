package com.example.qa.pages;

import com.example.qa.common.Constants;
import org.openqa.selenium.By;

import static com.example.qa.common.Constants.APP_URL;
import static com.example.qa.util.DriverSetup.driver;

public class LoginPage {
    private By imgLogo = By.id("divLogo");
    private By txtUserName = By.id("txtUsername");
    private By txtPassword = By.id("txtPassword");
    private By btnLogin = By.id("btnLogin");
    private By lblErrorMsg =By.id("spanMessage");

    public void navigateToURL(){
        driver.navigate().to(APP_URL);
    }
    public boolean isDisplayedHomePageLogo() {
        return driver.findElement(imgLogo).isDisplayed();
    }

    public void setUserName(String userName) {
        driver.findElement(txtUserName).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(txtPassword).sendKeys(password);
    }

    public void clickLoginBtn() {
        driver.findElement(btnLogin).click();
    }

    public String errorMsgIsDisplayed(){
        return driver.findElement(lblErrorMsg).getText();
    }
}
