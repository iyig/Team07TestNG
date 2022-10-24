package team07;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Engin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US0018 {
    Engin pages ;

    @Test
    public void test01() throws InterruptedException {
        pages= new Engin();

        // kullanici url` ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // kullanici Sing in' e tiklar
        pages.singIn.click();

        // kullanici gecerli kullanici bilgilerini girer (Kullanıcı Adı yada Eposta Adresi-Sifre)
        pages.username.sendKeys(ConfigReader.getProperty("email"));
        pages.password.sendKeys(ConfigReader.getProperty("password"));

        // kullanici giriş yapmak için Sing in e tiklar
        Thread.sleep(2000);
        pages.singin2.click();

        // kullanici My Account  a(Hesabim)  tıklar
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", pages.myAccount);
        pages.myAccount.click();

        // My Account (Hesabim) sayfasina giris yapildigi test edilir
        Assert.assertTrue(pages.myAccountDisplayd.isDisplayed());

        // kullanici acilan sayfada Store Manager(Magza Müdürü) butonuna tiklar
        pages.storeManager.click();

        // Store Manager sayfasina giris yapildigi test edilir
        String expectedUrl = "https://pearlymarket.com/store-manager/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

        // kullanici Refund (Geri Ödeme) butonuna tiklar
        pages.refund.click();

        // RequestID nin gönür olduğunu doğrulanır
        Assert.assertTrue(pages.requestId.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void test02() throws InterruptedException {
        pages= new Engin();

        // kullanici url` ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // kullanici Sing in' e tiklar
        ReusableMethods.waitFor(3);
        pages.singIn.click();

        // kullanici gecerli kullanici bilgilerini girer (Kullanıcı Adı yada Eposta Adresi-Sifre)
        pages.username.sendKeys(ConfigReader.getProperty("email"));
        pages.password.sendKeys(ConfigReader.getProperty("password"));

        // kullanici giriş yapmak için Sing in e tiklar
        Thread.sleep(2000);
        pages.singin2.click();

        // kullanici My Account  a(Hesabim)  tıklar
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", pages.myAccount);

        pages.myAccount.click();

        // My Account (Hesabim) sayfasina giris yapildigi test edilir
        Assert.assertTrue(pages.myAccountDisplayd.isDisplayed());

        // kullanici acilan sayfada Store Manager(Magza Müdürü) butonuna tiklar
        pages.storeManager.click();

        // Store Manager sayfasina giris yapildigi test edilir
        String expectedUrl = "https://pearlymarket.com/store-manager/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

        // kullanici Refund (Geri Ödeme) butonuna tiklar
        pages.refund.click();

        //Order Id nin görünür oldugu dogrulanir
        Assert.assertTrue(pages.orderId.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void test03() throws InterruptedException {
        pages= new Engin();

        // kullanici url` ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // kullanici Sing in' e tiklar
        pages.singIn.click();

        // kullanici gecerli kullanici bilgilerini girer (Kullanıcı Adı yada Eposta Adresi-Sifre)
        pages.username.sendKeys(ConfigReader.getProperty("email"));
        pages.password.sendKeys(ConfigReader.getProperty("password"));

        // kullanici giriş yapmak için Sing in e tiklar
        Thread.sleep(2000);
        pages.singin2.click();

        // kullanici My Account  a(Hesabim)  tıklar
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", pages.myAccount);

        pages.myAccount.click();

        // My Account (Hesabim) sayfasina giris yapildigi test edilir
        Assert.assertTrue(pages.myAccountDisplayd.isDisplayed());

        // kullanici acilan sayfada Store Manager(Magza Müdürü) butonuna tiklar
        pages.storeManager.click();

        // Store Manager sayfasina giris yapildigi test edilir
        String expectedUrl = "https://pearlymarket.com/store-manager/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

        // kullanici Refund (Geri Ödeme) butonuna tiklar
        pages.refund.click();

        //Amount un görünür olduğu doğrulanir
        ReusableMethods.waitFor(3);
        Assert.assertTrue(pages.amount.isDisplayed());

        Driver.closeDriver();

    }

    @Test
    public void test04() throws InterruptedException {
        pages= new Engin();

        // kullanici url` ye gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));

        // kullanici Sing in' e tiklar
        pages.singIn.click();

        // kullanici gecerli kullanici bilgilerini girer (Kullanıcı Adı yada Eposta Adresi-Sifre)
        pages.username.sendKeys(ConfigReader.getProperty("email"));
        pages.password.sendKeys(ConfigReader.getProperty("password"));

        // kullanici giriş yapmak için Sing in e tiklar
        Thread.sleep(2000);
        pages.singin2.click();

        // kullanici My Account  a(Hesabim)  tıklar
        Thread.sleep(3000);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", pages.myAccount);
        pages.myAccount.click();

        // My Account (Hesabim) sayfasina giris yapildigi test edilir
        Assert.assertTrue(pages.myAccountDisplayd.isDisplayed());

        // kullanici acilan sayfada Store Manager(Magza Müdürü) butonuna tiklar
        pages.storeManager.click();

        // Store Manager sayfasina giris yapildigi test edilir
        String expectedUrl = "https://pearlymarket.com/store-manager/";
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedUrl));

        // kullanici Refund (Geri Ödeme) butonuna tiklar
        pages.refund.click();

        //Type ve Reason açıklandiği doğrulanır
        Assert.assertTrue(pages.type.isDisplayed());
        Assert.assertTrue(pages.reason.isDisplayed());

        Driver.closeDriver();
    }
}
