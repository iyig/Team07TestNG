package team07;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Caner;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US002 {
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();
    Caner page= new Caner();

    @Test
    public void TC_001() throws InterruptedException {
        //Kullanici url'e gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        //Kullanici "Sign In" butonuna tiklar
        ReusableMethods.jsScrollClick(page.signInButton);

        //Kullanici acilan pencerede gecerli kullanici bilgileri girer
        page.userNameBox.sendKeys(ConfigReader.getProperty("email"));
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password")).perform();

        //Kullanici "Sign In" butonunu tiklar
        page.signInButton2.click();
        Thread.sleep(2000);
        //Kullanici acilan sayfada "My Account" gorungoruntuler
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        Assert.assertTrue(page.myAccount.isDisplayed());

    }

    @Test (dependsOnMethods = {"TC_001"})
    public void TC_002() throws InterruptedException {

        //Kullanici acilan sayfada "My Account" gorungoruntuler
        Assert.assertTrue(page.myAccount.isDisplayed());

        //Kullanici acilan sayfada "Cart" goruntuler
        Assert.assertTrue(page.cart.isDisplayed());

        //Kullanici acilan sayfada "My Orders" goruntuler
        Assert.assertTrue(page.myOrders.isDisplayed());

        //Kullanici acilan sayfada "Wishlist" goruntuler
        Assert.assertTrue(page.wishListMain.isDisplayed());

        //Kullanici acilan sayfada "My Account" goruntuler
        Assert.assertTrue(page.myAccountClickable.isDisplayed());
        // ReusableMethods.jsScrollClick(page.logOutManager);
    }

    @Test (priority = 2)
    public void TC_003() throws InterruptedException {

        //Kullanici "My Accounts" butonunu tiklar
        ReusableMethods.jsScrollClick(page.myAccountClickable);

        //Kullanici acilan sayfada, "Dashboard" altinda "Store Manager" goruntuler
        Assert.assertTrue(page.storeManagerUnderDashboard.isDisplayed());

        //Kullanici acilan sayfada, "Dashboard" altinda "Orders" goruntuler
        Assert.assertTrue(page.ordersUnderDashboard.isDisplayed());


        //Kullanici acilan sayfada, "Dashboard" altinda "Downloads" goruntuler
        Assert.assertTrue(page.downloadsUnderDashboard.isDisplayed());

        //Kullanici acilan sayfada, "Dashboard" altinda "Addresses" goruntuler
        Assert.assertTrue(page.downloadsUnderDashboard.isDisplayed());

        //Kullanici acilan sayfada, "Dashboard" altinda "Account details" goruntuler
        Assert.assertTrue(page.acoountDetailsUnderDashboard.isDisplayed());


        //Kullanici acilan sayfada, "Dashboard" altinda "Wishlist" goruntuler
        Assert.assertTrue(page.wishListUnderDashboard.isDisplayed());


    }

    @Test (priority = 3)
    public void TC_004() throws InterruptedException {

        //Kullanici acilan sayfada, "Dashboard" altinda "Support Tickets" goruntuler
        Assert.assertTrue(page.supportTicketUnderDashboard.isDisplayed());

        //Kullanici acilan sayfada, "Dashboard" altinda "Followings" goruntuler
        Assert.assertTrue(page.followingsUnderDashboard.isDisplayed());


        //Kullanici acilan sayfada, "Dashboard" altinda "Logout" goruntuler
        Assert.assertTrue(page.flogOutUnderDashboard.isDisplayed());

        //Kullanici sayfayi kapatir
        Driver.quitDriver();


    }
}
