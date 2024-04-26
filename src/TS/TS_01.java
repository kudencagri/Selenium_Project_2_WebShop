package TS;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_01 extends BaseDriver {
    @Test
    public void CreatUserAccount(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement Register=driver.findElement(By.linkText("Register"));
        Register.click();

        WebElement Gender=driver.findElement(By.id("gender-male"));
        Gender.click();

        WebElement FirstName=driver.findElement(By.id("FirstName"));
        FirstName.sendKeys("Çağrı Canras");

        WebElement LastName=driver.findElement(By.id("LastName"));
        LastName.sendKeys("Küden");

        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("Admin223199@gmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("admin2121");

        WebElement Cpassword=driver.findElement(By.name("ConfirmPassword"));
        Cpassword.sendKeys("admin2121");

        WebElement RegisterButon=driver.findElement(By.id("register-button"));
        RegisterButon.click();

        WebElement dogrulama=driver.findElement(By.cssSelector("[class='result']"));

        Assert.assertTrue(dogrulama.getText().contains("Your registration completed"));

        BekleVeKapat();
    }

}
