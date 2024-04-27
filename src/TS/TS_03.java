package TS;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_03 extends BaseDriver {
    @Test
    public void logOut(){
    driver.get("https://demowebshop.tricentis.com/");
       WebElement logIn=driver.findElement(By.xpath("(//div[@class='header-links']/ul/li)[2]"));
       logIn.click();

       WebElement Email=driver.findElement(By.id("Email"));
       Email.sendKeys("Admin223199@gmail.com");

       WebElement password=driver.findElement(By.id("Password"));
       password.sendKeys("admin2121");

       WebElement loginButton=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
       loginButton.click();

        WebElement dogrulama=driver.findElement(By.xpath("//div[@class='header-links']/ul/li"));

        Assert.assertTrue(dogrulama.getText().toLowerCase().contains("admin223199"));

        WebElement LogoutButton=driver.findElement(By.linkText("Log out"));
        LogoutButton.click();

        BekleVeKapat();
    }

}
