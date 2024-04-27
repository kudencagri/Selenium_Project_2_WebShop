package TS;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_06 extends BaseDriver {

    @Test
    public void SiparisVerme(){

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


            /*                                       GİRİS YAPILDI                                                         */


        WebElement kasa=driver.findElement(By.xpath("(//div[@class='details'] /h2)[3]"));
        kasa.click();

        WebElement AddtoCart=driver.findElement(By.cssSelector("[id='add-to-cart-button-72']"));
        AddtoCart.click();

        WebElement ShopingCart=driver.findElement(By.linkText("Shopping cart"));
        ShopingCart.click();


        WebElement Control=driver.findElement(By.cssSelector("[class='product-name']"));
        Assert.assertTrue(Control.getText().toLowerCase().contains("build your own cheap computer"),"istenilen sonuç olmadı");


        WebElement Country=driver.findElement(By.xpath("//*[@id='CountryId']"));

        Select selectCountry=new Select(Country);
        selectCountry.selectByValue("1");

        WebElement State=driver.findElement(By.xpath("//*[@id='StateProvinceId']"));

        Select selectState=new Select(State);
        selectState.selectByValue("54");

        WebElement AgreeButton=driver.findElement(By.xpath("//input[@id='termsofservice']"));
        AgreeButton.click();

        WebElement CheckOut=driver.findElement(By.xpath("//*[@id='checkout']"));
        CheckOut.click();

        WebElement Continue=driver.findElement(By.cssSelector("[id='billing-buttons-container'] >input"));
        Continue.click();

        WebElement In_Store=driver.findElement(By.id("PickUpInStore"));
        In_Store.click();

        WebElement Continue1=driver.findElement(By.xpath("(//input[@class='button-1 new-address-next-step-button'])[2]"));
        Continue1.click();


        WebElement PaymentMethod=driver.findElement(By.id("paymentmethod_2"));
        PaymentMethod.click();

        WebElement PaymentContinue=driver.findElement(By.xpath("//input[@class='button-1 payment-method-next-step-button']"));
        PaymentContinue.click();

        WebElement CardHolderName=driver.findElement(By.id("CardholderName"));
        CardHolderName.sendKeys("Cagri Canras");

        WebElement CardNumber=driver.findElement(By.id("CardNumber"));
        CardNumber.sendKeys("123456789123456789");

        WebElement CardCode=driver.findElement(By.id("CardCode"));
        CardCode.sendKeys("1234");

        WebElement PaymentContunie=driver.findElement(By.xpath("//*[@class='button-1 payment-info-next-step-button']"));
        PaymentContunie.click();

        WebElement FiyatDogrulama=driver.findElement(By.xpath("//*[@class='product-subtotal']"));

        String sayi="815.00";
        Assert.assertEquals(sayi,FiyatDogrulama.getText(),"istenilen sonuc verilmedi");


        WebElement Confirm=driver.findElement(By.xpath("//*[@class='button-1 confirm-order-next-step-button']"));
        Confirm.click();
        WebElement Details=driver.findElement(By.xpath("//*[text()='Click here for order details.']"));
        Details.click();









        BekleVeKapat();//*[@class='button-1 payment-info-next-step-button']

    }
}
