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
        MyFunc.Bekle(2);

        WebElement Unsuccessfull=driver.findElement(By.cssSelector("[class='validation-summary-errors'] > span"));
        Assert.assertTrue(Unsuccessfull.getText().toLowerCase().contains("login was unsuccessful"),"test istenileni karşılamadı");

        BekleVeKapat();
    }
}
