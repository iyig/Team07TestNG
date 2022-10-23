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

public class US008 {


    @Test
    public void test01() {

        //=================     TC001     =================//

        Aybuke aybuke = new Aybuke();
        //Kullanıcı (Store manager) "https://pearlymarket.com" adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("url"));
        //Kullanıcı "Sign in" butonuna tıklar
        Actions action = new Actions(Driver.getDriver());
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
        //Kullanıcı açılan sayfada "Virtual" kutucuğuna tıklar
        Aybuke.virtualButton.click();
        //Kullanıcı "PRODUCT TİTLE" kutucuğuna ürünün başlığının ürün girişini yapar.
        Aybuke.proTitle.sendKeys("kazak");
        //Kullanıcı boş çıkan resim ekranlarından büyük olanına tıklar
        Aybuke.buyukResim.click();
        //Kullanıcı "Medya Library" butonuna tıklar
        Aybuke.medyaLibraryButton.click();
        //Kullanıcı eklemek istediği ürünün resmine tıklar ve açılan sayfada "select" butonuna tıklar
        Aybuke.eklenecekUrununResmi.click();
        Aybuke.selectButton.click();
        //Kullanıcı boş çıkan resim ekranlarından küçük olanına tıklar ve açılan sayfada "add to gallery" butonuna tıklar
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Aybuke.kucukResim.click();
        Aybuke.eklenecekUrununResmi2.click();
        Aybuke.addToGalleryButton.click();
        //Kullanıcı ürünün kategoisini seçer
        action.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(5);
        Aybuke.clothingCategory.click();
        Aybuke.clothingCategory.isSelected();
        //Kullanıcı "Sku" kutucuğunun değerini girer
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Aybuke.skuTextBox.sendKeys("-");
        //Kullanıcı açılan sayfanın altındaki  "Manage Stock" ve "Stock Qty" tıklar
        ReusableMethods.waitFor(5);
        JavascriptExecutor jse1 = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("window.scrollBy(0,250)");
        WebDriverWait wait1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        try {
            manageStockClickBox.click();
        } catch (ElementClickInterceptedException | StaleElementReferenceException e) {
            wait.until(ExpectedConditions.visibilityOf(manageStockClickBox));
            manageStockClickBox.click();
        }
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Aybuke.stockQtyTextBox.click();
        Aybuke.stockQtyTextBox.clear();
        //Kullanıcı "Stock Qty" nin yanındaki kutucuğa stock miktarı yazabilmeli
        Aybuke.stockQtyTextBox.sendKeys("50");

        //==================  TC002  =================//

        //Kullanıcı "Allow Backorders" metnini görür ve Allow Backorders textbox ına tıklar
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Aybuke.allowBackorders.isDisplayed();
        Aybuke.allowBackordersClickBox.click();
        //Kullanıcı "do not allow" , "allow, but notify customer",  "allow " seçeneklerinin görünür olduğunu doğrular
        Aybuke.doNotAllow.isDisplayed();
        Aybuke.allowButNotifyCustomer.isDisplayed();
        Aybuke.allow.isDisplayed();
        //Kullanıcı "sold individually" butonuna tıklar ve bu optionların seçilebilir olduğunu doğrular
        soldIndividuallyClickBox.click();
        Assert.assertTrue(soldIndividuallyClickBox.isSelected());
        //Kullanıcı "Submit" butonuna tıklar
        action.sendKeys(Keys.PAGE_DOWN).perform();
        Aybuke.submitButton.click();
        //Kullanıcı "Product Successfully Published" yazısını gördüğünü doğrular
        Assert.assertTrue(successMessage.isDisplayed());
}}
