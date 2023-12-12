package org.testscripts;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import testsuite.TestSuiteBase;
import utils.CommonActions;
import utils.Loadproperties;

public class LoginTest extends TestSuiteBase{

    private static final Logger log = LogManager.getLogger(LoginTest.class);
    @Test
    public void loginh3d() throws Exception {
        TestSuiteBase test = new TestSuiteBase();
        CommonActions common = new CommonActions(driver);
        log.info("Setting up browser and opening URL");
        test.setUp();
        log.info("Opened browser and opened URL");
        log.info("Entering username");
        common.sendKeys(By.xpath(Loadproperties.getPropertyvalue("username")), Loadproperties.gettestdatavalue("usernamevalue"));
        log.info("Entering password");
        common.sendKeys(By.xpath(Loadproperties.getPropertyvalue("password")), Loadproperties.gettestdatavalue("passwordvalue"));
        log.info("Clicking on Submit");
        common.click(By.xpath(Loadproperties.getPropertyvalue("submit")));
    }
}
