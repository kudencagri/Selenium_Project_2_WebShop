package TS;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TS_05 extends BaseDriver {
    @Test
    public void NegatifLogin1(){ // E-posta ve şifre kısmını boş bırakarak giriş yapmaya çalıştığımda, "Login was unsuccessful" mesajını görüntüleyebilmeliyim.

        driver.get("https://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.xpath("(//div[@class='header-links']/ul/li)[2]"));
        logIn.click();


        WebElement loginButton=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginButton.click();


        WebElement Unsuccessfull=driver.findElement(By.cssSelector("[class='validation-summary-errors'] > span"));
        Assert.assertTrue(Unsuccessfull.getText().toLowerCase().contains("login was unsuccessful"),"test istenileni karşılamadı");

        BekleVeKapat();
    }

    @Test
    public void NegatifLogin2(){ // Geçerli e-posta, boş şifre ile giriş yapmaya çalıştığımda, "Login was unsuccessful" mesajını görüntüleyebilmeliyim.

        driver.get("https://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.xpath("(//div[@class='header-links']/ul/li)[2]"));
        logIn.click();

        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("Admin223199@gmail.com");

        WebElement loginButton=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginButton.click();


        WebElement Unsuccessfull=driver.findElement(By.cssSelector("[class='validation-summary-errors'] > span"));
        Assert.assertTrue(Unsuccessfull.getText().toLowerCase().contains("login was unsuccessful"),"test istenileni karşılamadı");

        BekleVeKapat();
    }
    @Test
    public void NegatifLogin3(){ // Boş e-posta, geçerli şifre ile giriş yapmaya çalıştığımda, "Login was unsuccessful" mesajını görüntüleyebilmeliyim.

        driver.get("https://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.xpath("(//div[@class='header-links']/ul/li)[2]"));
        logIn.click();

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("admin2121");

        WebElement loginButton=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginButton.click();


        WebElement Unsuccessfull=driver.findElement(By.cssSelector("[class='validation-summary-errors'] > span"));
        Assert.assertTrue(Unsuccessfull.getText().toLowerCase().contains("login was unsuccessful"),"test istenileni karşılamadı");

        BekleVeKapat();
    }

    @Test
    public void NegatifLogin4_1(){ // Geçersiz e-posta veya şifre bilgileriyle giriş yapmaya çalıştığımda, "Login was unsuccessful" mesajını görüntüleyebilmeliyim.

        driver.get("https://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.xpath("(//div[@class='header-links']/ul/li)[2]"));
        logIn.click();

        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("Admin22319@gmail.com"); // Geçersiz Email

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("admin2121");

        WebElement loginButton=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginButton.click();


        WebElement Unsuccessfull=driver.findElement(By.cssSelector("[class='validation-summary-errors'] > span"));
        Assert.assertTrue(Unsuccessfull.getText().toLowerCase().contains("login was unsuccessful"),"test istenileni karşılamadı");

        BekleVeKapat();
    }

    @Test
    public void NegatifLogin4_2(){ // Geçersiz e-posta veya şifre bilgileriyle giriş yapmaya çalıştığımda, "Login was unsuccessful" mesajını görüntüleyebilmeliyim.

        driver.get("https://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.xpath("(//div[@class='header-links']/ul/li)[2]"));
        logIn.click();

        WebElement Email=driver.findElement(By.id("Email"));
        Email.sendKeys("Admin223199@gmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("admin");             // Geçersiz Şifre

        WebElement loginButton=driver.findElement(By.xpath("//*[@class='button-1 login-button']"));
        loginButton.click();


        WebElement Unsuccessfull=driver.findElement(By.cssSelector("[class='validation-summary-errors'] > span"));
        Assert.assertTrue(Unsuccessfull.getText().toLowerCase().contains("login was unsuccessful"),"test istenileni karşılamadı");

        BekleVeKapat();
    }

}
