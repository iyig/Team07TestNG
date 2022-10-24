package team07;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Engin;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class US0019 {
    Engin pages=new Engin();
    Actions actions = new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01() throws IOException, InterruptedException {

        //kullanici url` ye gider
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

        //kullanici Followers (Takipciler) butonuna tiklar
        pages.followers.click();
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        //Takipci isimlerinin(Name) görünür olduğu test edilir
        //Takipci Email adreslerinin görünür olduğu test edilir
        //Takipci islemlerinin (Actions)görünür olduğu test edilir

        List<WebElement> follower= pages.table;
        softAssert.assertTrue(follower.size()==1);

        String actualFollowers=pages.empty.getText();
        String expectedFollewers="No data in the table";
        softAssert.assertEquals(actualFollowers,expectedFollewers);

        ReusableMethods.getScreenshotWebElement("Takipcilerin isimleri, email adresi ve islemleri görüntülenemiyor",pages.empty);
        ReusableMethods.getScreenshot("Takipcilerin isimleri, email adresi ve islemleri görüntülenemiyor");
        softAssert.assertAll();
    }

}
