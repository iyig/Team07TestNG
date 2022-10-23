package team07;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Aybuke;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static pages.Aybuke.*;

public class US007 {
    @Test
    public void test01() {

        //TC001

        //Kullanıcı (Store manager) "https://pearlymarket.com" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı "Sign in" butonuna tıklar
        Aybuke aybuke = new Aybuke();
        Aybuke.signin.click();
        //Kullanıcı "Username or E-mail adress" bölümüne geçerli bir mail adresi girer
        Aybuke.username.sendKeys(ConfigReader.getProperty("email"));
        //Kullanıcı "Password" bölümüne doğru şifreyi girer
        Aybuke.password.sendKeys(ConfigReader.getProperty("password"));
        //Kullanıcı "Sign in" butonuna tıklar ve sayfaya giriş yapar
        Aybuke.ikinciSignin.click();
        //Kullanıcı sayfanın en altına iner My Account a tıklar
        ReusableMethods.waitFor(5);
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollBy(0,250)");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        try {
            myAccount.click();
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(myAccount));
            myAccount.click();
        }
        //Kullanıcı store manager  a tıklar
        Aybuke.storeManager.click();
        //Kullanıcı products a tıklar
        Aybuke.products.click();
        //Kullanıcı açılan sayfada "Add New Product" butonuna tıklar
        Aybuke.addNewProduct.click();
        //Kullanıcı "Products Brands" menüsünün görünür olduğunu doğrular
        Actions action = new Actions(Driver.getDriver());
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(productBrandsMenu.isDisplayed());
        //Kullanıcı brandlerin seçilebilir olduğunu test eder
        ReusableMethods.waitFor(5);
        adidasCheckbox.click();
        Assert.assertTrue(adidasCheckbox.isSelected());
        Aybuke.dRcheckbox.click();
        Assert.assertTrue(dRcheckbox.isSelected());
        Aybuke.elegantAutoGroupCheckbox.click();
        Assert.assertTrue(elegantAutoGroupCheckbox.isSelected());
        Aybuke.homeDesignCheckbox.click();
        Assert.assertTrue(homeDesignCheckbox.isSelected());
        Aybuke.lCwCheckbox.click();
        Assert.assertTrue(lCwCheckbox.isSelected());
        Aybuke.nikeCkeckbox.click();
        Assert.assertTrue(nikeCkeckbox.isSelected());
}}
