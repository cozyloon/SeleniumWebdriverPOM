package com.example.qa.tests;

import com.example.qa.common.Constants;
import com.example.qa.functions.Login;
import com.example.qa.util.TestBase;
import org.testng.annotations.Test;

import static com.example.qa.common.ResponseData.*;

public class LoginTest extends TestBase {

    @Test(description = "", alwaysRun = true, priority = 1)
    public void testLoginPageValidate() {
        softAssert.assertTrue(Login.validateLoginPageIsDisplayed(), "Login page not reached!");
        softAssert.assertAll();
    }

    @Test(description = "", alwaysRun = true, priority = 2)
    public void testUserLogin() {
        Login.userLogin(Constants.INVALID_USERNAME, Constants.INVALID_PASSWORD);
        softAssert.assertEquals(Login.lblErrorMsg(), INVALID_CREDENTIALS, INVALID_ERROR_MSG);

        Login.userLogin(Constants.EMPTY_USERNAME, Constants.EMPTY_PASSWORD);
        //softAssert.assertEquals(Login.lblErrorMsg(), USERNAME_EMPTY_ERROR, INVALID_ERROR_MSG);

        Login.userLogin(Constants.VALID_USERNAME, Constants.EMPTY_PASSWORD);
        //softAssert.assertEquals(Login.lblErrorMsg(), ResponseData.PASSWORD_EMPTY_ERROR, INVALID_ERROR_MSG);

        Login.userLogin(Constants.EMPTY_USERNAME, Constants.VALID_PASSWORD);
        //softAssert.assertEquals(Login.lblErrorMsg(), USERNAME_EMPTY_ERROR, INVALID_ERROR_MSG);

        softAssert.assertAll();
    }
}
