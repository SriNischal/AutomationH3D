package org.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dbx_creation {
    //login log;
    @Test
    public void createdbx() throws Exception {
        /*log = new login();
        log.loginh3d();
        login.driver.findElement(By.xpath("//span[text()='User']")).click();
        login.driver.findElement(By.xpath("//span[@class='devicetext']")).click();
        login.driver.findElement(By.xpath("//li[text()='Dbx']")).click();
        Thread.sleep(3000);
        login.driver.findElement(By.xpath("//button[@class='MuiButton-root btnAdd']")).click();
        login.driver.findElement(By.xpath("//input[@id='dev_id']")).sendKeys("DBX12345");
        login.driver.findElement(By.xpath("//div[@id='mui-component-select-type']")).click();
        login.driver.findElement(By.xpath("//li[text()='DBX']")).click();
        login.driver.findElement(By.xpath("//input[@id='name']")).sendKeys("DBX");
        login.driver.findElement(By.xpath("//input[@id='model']")).sendKeys("DBX");
        WebElement mapElement = login.driver.findElement(By.xpath("//div[@class='map-element mapElementStyle leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']")); // Replace with the actual ID

        // Calculate the coordinates of the point you want to double-click within the map
        double xCoordinate = 1.3012266329871314; // Replace with the desired X coordinate
        double yCoordinate = 103.78956377506258; // Replace with the desired Y coordinate

        // Use Actions class to perform a double click on the map at the specified coordinates
        Actions actions = new Actions(login.driver);
        actions.moveToElement(mapElement, (int) xCoordinate, (int) yCoordinate).doubleClick().build().perform();
        login.driver.findElement(By.xpath("//button[@type='submit']")).click();
        login.driver.findElement(By.xpath("//input[@class='searchBox']")).sendKeys("DBX12345");
        login.driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium iconBox css-1yxmbwk']")).click();
        Thread.sleep(3000);
        Assert.assertEquals(login.driver.findElement(By.xpath("//td[text()='DBX12345']")).getText(),"DBX12345");*/

    }
}
