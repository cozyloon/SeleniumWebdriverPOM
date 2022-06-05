package com.example.qa.util;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class TestBase {
    protected static SoftAssert softAssert = new SoftAssert();
    protected static Logger logger = Logger.getAnonymousLogger();

    @BeforeSuite
    public void beforeSuite() {
        DriverSetup.launchDriver();
    }

    @AfterSuite
    public void afterSuite() {
        DriverSetup.closeDriver();
    }
}
